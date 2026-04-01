5.4.3 Pertanyaan
1. Kenapa dibutuhkan variable mid pada method TotalDC()?
Variable mid dibutuhkan untuk menentukan titik tengah array guna membagi (divide) satu masalah besar menjadi dua sub-masalah yang lebih kecil secara seimbang.
2. Untuk apakah statement double lsum = totalDC(arr, l, mid); double rsum = totalDC(arr, mid+1, r); dilakukan dalam TotalDC()?
Statement tersebut dilakukan untuk memproses penambahan nilai secara rekursif pada bagian kiri array (lsum) dan bagian kanan array (rsum) hingga mencapai elemen terkecil.
3. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti return lsum+sum;?
Penjumlahan tersebut merupakan tahap combine (penggabungan) untuk menyatukan hasil perhitungan dari sub-masalah kiri dan kanan menjadi satu nilai total akhir.
4. Apakah base case dari totalDC()?
Base case dari totalDC() adalah saat nilai indeks kiri sama dengan indeks kanan (l==r), yang menandakan array hanya memiliki satu elemen sehingga nilai tersebut langsung dikembalikan.5. 
5. Tarik Kesimpulan tentang cara kerja totalDC()
Kesimpulannya, totalDC() bekerja dengan membagi array menjadi dua bagian terus-menerus hingga menyisakan satu elemen, lalu menjumlahkan kembali hasil-hasil tersebut secara bertahap hingga tuntas.