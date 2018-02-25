package com.example.aliyya.aliyya_1202154356.AirMineral;

import com.example.aliyya.aliyya_1202154356.R;

import java.util.ArrayList;

/**
 * Created by Aliyya on 2/25/2018.
 */

public class KoleksiAirMineral {
    public static ArrayList<AirMineral> getAirMineral() {
        ArrayList<AirMineral> airMineral = new ArrayList<>();
        AirMineral airMineral1 = null;

        airMineral1 = new AirMineral();
        airMineral1.setNama("Aqua");
        airMineral1.setDeskripsi("Air mineral alami langsung dari sumber mata air pilihan dengan kualitas air yang menyegarkan dan melepaskan dahaga");
        airMineral1.setImage(R.drawable.aqua);
        airMineral.add(airMineral1);

        airMineral1 = new AirMineral();
        airMineral1.setNama("Prestine");
        airMineral1.setDeskripsi("Pristine 8+ merupakan Air minum Alkaline dengan kandungan pH 8+ (Melebihi 8) yang memberikan manfaat detoxifikasi bagi tubuh kita. Buat yang belum tau nih gan, air alkaline memilik banyak manfaat dan pastinya sangat baik untuk tubuh yang bisa menjaga keseimbangan kadar pH dan efektif untuk membantu proses detoxifikasi. Pristine 8+ berasal dari sumber mata air terbaik di kawasan konservasi Gunung Gede Pangrango dan diproses dengan teknologi Ionisasi dari Nihon Trim Jepang sehingga menjadikan Pristine 8+ tentu berbeda dibanding dengan air mineral lainnya.");
        airMineral1.setImage(R.drawable.pristine);
        airMineral.add(airMineral1);

        airMineral1 = new AirMineral();
        airMineral1.setNama("Le Minerale");
        airMineral1.setDeskripsi("Sumber mata air Le Minerale berasal dari sumber mata air pegunungan terpilih yang diambil dari kedalaman 100 meter di bawah tanah dan dibotolkan langsung di sumbernya menggunakan mineral protection system untuk melindungi kandungan mineral alami yang ditandai dengan kerasnya botol sebelum dibuka dan diproduksi tanpa tersentuh tangan manusia secara langsung.");
        airMineral1.setImage(R.drawable.leminerale);
        airMineral.add(airMineral1);

        airMineral1 = new AirMineral();
        airMineral1.setNama("Cleo");
        airMineral1.setDeskripsi("Cleo atau Cleo Oxygenated Water merupakan salah satu produk air minum dalam kemasan yang menjanjikan keunggulan dengan kandungan oksigen yang tinggi yang sangat bermanfaat bagi tubuh manusia. Cleo memiliki kandungan oksigen yang lebih tinggi yaitu sebanyak 100 ppm atau 20 kali air minum  biasa. Cleo diproses melalui teknologi dari USA yaitu Oxygen Enanced Combustion Technology yang modern dan higenis.");
        airMineral1.setImage(R.drawable.cleo);
        airMineral.add(airMineral1);

        airMineral1 = new AirMineral();
        airMineral1.setNama("Amidis");
        airMineral1.setDeskripsi("AMIDIS adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan,melalui proses pemanasan hingga 180 derajat celcius sehingga menghasilkan air minum yang murni (NON-MINERAL) tanpa kandungan polutan, mineral anorganik maupun bahan kontaminasi lain seperti bahan kimia maupun bahan pestisida.");
        airMineral1.setImage(R.drawable.amidis);
        airMineral.add(airMineral1);

        airMineral1 = new AirMineral();
        airMineral1.setNama("Nestle");
        airMineral1.setDeskripsi("Dengan sumber mata air pilihan, diproses secara higienis agar terjamin mutu dan kualitasnya");
        airMineral1.setImage(R.drawable.nestle);
        airMineral.add(airMineral1);

        return airMineral;
    }
}
