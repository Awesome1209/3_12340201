package org.example.project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class SimpleInfo(
    val label: String,
    val value: String,
    val emoji: String
)

@Composable
fun MyProfileScreen() {
    val fullBio = """
        Mahasiswa Teknik Informatika ITERA 2023 yang antusias dengan dunia data. Menghabiskan waktu untuk mengeksplorasi potensi AI dan bagaimana menceritakan data melalui visualisasi grafis yang menarik.

        Selalu terbuka untuk peluang kolaborasi, proyek baru, dan koneksi baru di industri teknologi. Let's connect and grow together!
    """.trimIndent()

    val infoList = listOf(
        SimpleInfo("Email", "awi.123140201@itera.ac.id", "📧"),
        SimpleInfo("Phone", "+62 895-0863-8032", "📞"),
        SimpleInfo("Location", "Lampung, Indonesia", "📍")
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .widthIn(max = 720.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            ProfileHeader(
                name = "Awi Septian Prasetyo",
                subtitle = "Teknik Informatika • ITERA 2023",
                initials = "AP"
            )

            ProfileCard(
                fullBio = fullBio,
                infoList = infoList,
                onButtonClick = { }
            )
        }
    }
}

@Composable
fun ProfileHeader(
    name: String,
    subtitle: String,
    initials: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // AVATAR TANPA FOTO (lingkaran + inisial)
        Box(
            modifier = Modifier
                .size(92.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.primaryContainer),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = initials,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )
        }

        Spacer(Modifier.width(16.dp))

        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = name,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(Modifier.height(2.dp))
            Text(
                text = subtitle,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

@Composable
fun ProfileCard(
    fullBio: String,
    infoList: List<SimpleInfo>,
    onButtonClick: () -> Unit
) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Bio", fontWeight = FontWeight.Bold)
            Spacer(Modifier.height(8.dp))

            Text(
                text = fullBio,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                maxLines = if (expanded) Int.MAX_VALUE else 3,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(Modifier.height(6.dp))

            TextButton(onClick = { expanded = !expanded }) {
                Text(if (expanded) "Sembunyikan Detail" else "Tampilkan Detail")
            }

            AnimatedVisibility(visible = expanded) {
                Column {
                    Divider()
                    Spacer(Modifier.height(10.dp))
                    infoList.forEach { InfoItem(it.emoji, it.label, it.value) }
                }
            }

            Spacer(Modifier.height(14.dp))

            Button(
                onClick = onButtonClick,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(999.dp)
            ) {
                Text("Contact Me")
            }
        }
    }
}

@Composable
fun InfoItem(emoji: String, label: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = emoji, fontSize = 18.sp)
        Spacer(Modifier.width(12.dp))
        Column {
            Text(text = label, fontWeight = FontWeight.SemiBold)
            Text(text = value, color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
    }
}