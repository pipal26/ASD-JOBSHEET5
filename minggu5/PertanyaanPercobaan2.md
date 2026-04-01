5.3.3.	Pertanyaan
1.	Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!
pangkatBF() menggunakan algoritma Brute Force dengan cara melakukan perkalian berulang melalui iterasi for , sedangkan pangkatDC() menggunakan algoritma Divide and Conquer dengan memecah pangkat menjadi bagian-bagian lebih kecil melalui rekursi.
2.	Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
Tahap combine sudah termasuk dalam kode pangkatDC(), yang ditunjukkan pada baris return di mana hasil dari pemanggilan rekursif dikalikan kembali (dikombinasikan) untuk mendapatkan hasil akhir.
3.	Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter?
Method tersebut tetap relevan memiliki parameter untuk fleksibilitas penggunaan nilai luar, namun bisa dibuat tanpa parameter dengan memanfaatkan atribut nilai dan pangkat yang sudah ada di dalam class  melalui kode berikut:
int pangkatBF() {
    int hasil = 1;
    for (int i = 0; i < pangkat; i++) {
        hasil = hasil * nilai;
    }
    return hasil;
}
4.	Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!
Cara kerja pangkatBF() adalah menghitung hasil pangkat secara linear melalui satu perulangan utuh , sementara pangkatDC() bekerja dengan membagi masalah pangkat menjadi setengahnya secara terus-menerus hingga mencapai kondisi dasar lalu menggabungkan hasilnya kembali.
