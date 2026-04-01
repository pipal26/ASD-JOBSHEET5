package minggu5;

public class NilaiAlgoritma {
    int cariMaxUTS(Mahasiswa[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int lmax = cariMaxUTS(mhs, l, mid);
        int rmax = cariMaxUTS(mhs, mid + 1, r);
        return (lmax > rmax) ? lmax : rmax;
    }

    int cariMinUTS(Mahasiswa[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int lmin = cariMinUTS(mhs, l, mid);
        int rmin = cariMinUTS(mhs, mid + 1, r);
        return (lmin < rmin) ? lmin : rmin;
    }

    double rataUASBF(Mahasiswa[] mhs) {
        double total = 0;
        for (int i = 0; i < mhs.length; i++) {
            total += mhs[i].nilaiUAS;
        }
        return total / mhs.length;
    }
}