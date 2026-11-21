# PBO-GUI <div align="center">

# 🧮 Eksplorasi GUI Java (Swing & AWT)

### Tugas 3B – Latihan Graphical User Interface pada Java

![Java](https://img.shields.io/badge/Java-17+-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/GUI-Swing%20%26%20AWT-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Selesai-success?style=for-the-badge)

</div>

---

## 👤 Identitas

| | |
|---|---|
| **Nama** | Nabil Naufal Anugrah |
| **NIM** | F1D02510127 |
| **Mata Kuliah** | Pemrograman Berorientasi Objek |
| **Tugas** | 3B – Latihan/Eksplorasi Materi GUI pada Java |

---

## 📝 Deskripsi Aplikasi

Aplikasi kalkulator penjumlahan sederhana berbasis Java Swing. Pengguna memasukkan dua angka, lalu klik tombol **Hitung** untuk menampilkan hasil penjumlahannya. Saat kursor diarahkan ke tombol, warna tombol berubah menjadi cyan.

---

## 📸 Screenshot Aplikasi

<div align="center">

| Tampilan Awal | Setelah Interaksi |
|:---:|:---:|
| ![Awal](screenshot/tampilan-awal.png) | ![Interaksi](screenshot/tampilan-interaksi.png) |

</div>

---

## 🧩 5 Komponen Utama GUI yang Digunakan

### 1️⃣ Top-level Container → `JFrame`
Jendela utama aplikasi. Semua komponen lain diletakkan di dalamnya.

### 2️⃣ Intermediate Container → `JPanel`
Wadah perantara untuk mengelompokkan komponen sebelum dimasukkan ke `JFrame`. Aplikasi ini memakai 2 panel: panel form dan panel tombol.

### 3️⃣ Atomic Component → `JLabel`, `JTextField`, `JButton`
Komponen dasar yang langsung berinteraksi dengan pengguna.

| Class | Fungsi |
|---|---|
| `JLabel` | Menampilkan teks dan hasil perhitungan |
| `JTextField` | Input angka dari pengguna |
| `JButton` | Tombol Hitung |

### 4️⃣ Layout Classes → `BorderLayout`, `GridLayout`, `FlowLayout`

| Layout | Digunakan pada |
|---|---|
| `BorderLayout` | Susunan utama frame (CENTER dan SOUTH) |
| `GridLayout` | Panel form (3 baris x 2 kolom) |
| `FlowLayout` | Panel tombol (layout bawaan `JPanel`) |

### 5️⃣ Event Listener → `ActionListener` & `MouseAdapter`

| Interface/Class | Jenis | Fungsi |
|---|---|---|
| `ActionListener` | Interface | `actionPerformed()` dipanggil saat tombol Hitung diklik |
| `MouseAdapter` | Adapter Class | Override `mouseEntered()` dan `mouseExited()` untuk efek hover tombol |

---

## 🗂️ Struktur Repositori

```
📦 PBO-GUI-KALKULATOR-SWING
 ┣ 📂 screenshot
 ┃ ┣ 🖼️ tampilan-awal.png
 ┃ ┗ 🖼️ tampilan-interaksi.png
 ┣ 📜 KalkulatorGUI.java
 ┗ 📜 README.md
```

## ▶️ Cara Menjalankan

```bash
javac KalkulatorGUI.java
java KalkulatorGUI
```

---

<div align="center">

Dibuat dengan ☕ oleh **Nabil Naufal Anugrah** (F1D02510127)

</div>
