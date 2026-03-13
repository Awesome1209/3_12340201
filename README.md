# Tugas Praktikum Minggu 3 — My Profile App (Compose Multiplatform)

## Deskripsi Singkat
Proyek ini adalah aplikasi **My Profile App** menggunakan **Compose Multiplatform**. Aplikasi menampilkan halaman profil yang berisi **foto/ avatar profil berbentuk lingkaran**, **nama**, **bio/deskripsi singkat**, dan **informasi kontak** (Email, Phone, Location). Selain itu, terdapat tombol aksi dan fitur **AnimatedVisibility** untuk menampilkan/menyembunyikan detail.

---
## Screenshot Hasil

<img width="2048" height="1084" alt="Tugas3" src="https://github.com/user-attachments/assets/51053983-9b23-477a-9b99-c08fd3ccc94f" />

<img width="2048" height="1084" alt="Tugas3 (1)" src="https://github.com/user-attachments/assets/91aac2b5-f0c7-4df4-9d8c-f43f087b71cb" />

---
## Tujuan Praktikum
- Memahami konsep dasar **Composable** pada Compose Multiplatform.
- Menggunakan layout dasar (**Column, Row, Box**) untuk menyusun UI.
- Menerapkan komponen UI Material (**Card, Text, Button, Image/Icon**).
- Menggunakan **Modifier** untuk mengatur ukuran, padding, alignment, bentuk (shape), dan styling.
- Membuat komponen UI yang **reusable** (minimal 3 composable function).

---

## Pemenuhan Kriteria Penugasan (Checklist)
Berikut pemetaan kriteria tugas dengan implementasi pada project ini:

### 1) Halaman Profile
- ✅ **Header**: foto/ avatar profil **circular** + **nama**
- ✅ **Bio / deskripsi singkat**
- ✅ **List informasi**: Email, Phone, Location

### 2) Minimal 3 Composable Function Reusable
- ✅ `MyProfileScreen()` — composable utama halaman
- ✅ `ProfileHeader()` — header profil (avatar + nama)
- ✅ `ProfileCard()` — card bio + tombol + detail
- ✅ `InfoItem()` — item informasi (Email/Phone/Location)

### 3) Penggunaan Komponen & Layout (Minimal)
- ✅ `Column`
- ✅ `Row`
- ✅ `Box`
- ✅ `Card`
- ✅ `Text`
- ✅ `Button`
- ✅ `Image` *(atau avatar alternatif)*
- ✅ `Icon/Indicator` *(menggunakan emoji sebagai indikator visual jika Icons bermasalah)*

### 4) Bonus (Modifikasi/Variasi)
- ✅ **AnimatedVisibility** untuk menampilkan/menyembunyikan detail (bio lengkap & daftar info)

---

## Struktur Fitur Aplikasi
1. **ProfileHeader**
   - Menampilkan avatar/foto berbentuk lingkaran dan nama pengguna.
2. **ProfileCard**
   - Menampilkan ringkasan bio, tombol toggle detail, detail info, dan tombol Contact.
3. **InfoItem**
   - Menampilkan label dan value untuk Email/Phone/Location.

---

## Cara Menjalankan Project

### Android
1. Buka project di **Android Studio**
2. Pilih device/emulator
3. Klik tombol **Run (▶)**

### Desktop (Jika tersedia pada template project)
1. Pilih konfigurasi run **Desktop**
2. Klik tombol **Run (▶)**

---

## Identitas
- **Nama**: Awi Septian Prasetyo  
- **NIM**: 123140201  
