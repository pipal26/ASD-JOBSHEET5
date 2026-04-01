5.2.3.	Pertanyaan
1.	Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!
if berfungsi sebagai base case untuk menghentikan rekursi saat nilai mencapai 1, sedangkan blok else berfungsi sebagai tahapan recursion untuk memecah masalah menjadi sub-masalah yang lebih kecil.
2.	Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!
menggunakan while dengan menginisialisasi konter di luar dan melakukan inkrementasi di dalam blok perulangan tersebut.
3.	Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !
fakto *= i merupakan operasi iteratif yang mengalikan nilai secara langsung dalam satu cakupan, sedangkan n * faktorialDC(n-1) merupakan operasi rekursif yang memanggil kembali fungsi tersebut dengan parameter yang lebih kecil.
4.	Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF()  dan faktorialDC()!
faktorialBF() bekerja secara iteratif melalui perulangan linear dari awal hingga akhir, sementara faktorialDC() bekerja secara rekursif dengan membagi masalah besar menjadi bagian-bagian terkecil hingga mencapai kondisi dasar.
