package com.example.asus.myrecyclerview;

import java.util.ArrayList;

public class BungaData {
    public static String[][] data = new String[][]{
            {"Jenis Bunga Seruni", "Krisan", "https://i0.wp.com/kuyahejo.com/wp-content/uploads/2016/08/Bunga-Seruni-Krisan.jpg?resize=768%2C480&ssl=1"},
            {"Jenis Bunga Kamboja", "Jepun", "https://i1.wp.com/kuyahejo.com/wp-content/uploads/2016/08/Bunga-Kamboja-Putih.jpg?resize=768%2C586&ssl=1"},
            {"Jenis Bunga Adenium", "Kamboja Jepang", "https://i2.wp.com/kuyahejo.com/wp-content/uploads/2016/08/Bunga-Adenium.jpg?resize=768%2C677&ssl=1"},
            {"Jenis Bunga Hortensia", "Hydrangea", "https://i1.wp.com/kuyahejo.com/wp-content/uploads/2016/08/Jenis-bunga-Hydrangea.jpg?resize=768%2C511&ssl=1"},
            {"Jenis Bunga Violet", "Viola", "https://i2.wp.com/kuyahejo.com/wp-content/uploads/2016/08/Warna-warni-jenis-bunga-Viola.jpg?resize=768%2C576&ssl=1"},
            {"Jenis Bunga Wijaya Kusuma", "Kadupul", "https://i0.wp.com/kuyahejo.com/wp-content/uploads/2016/08/Jenis-Bunga-Wijaya-Kusuma.jpg?resize=768%2C576&ssl=1"},
            {"Jenis Bunga Lonceng", " Blue Belss", "https://i0.wp.com/kuyahejo.com/wp-content/uploads/2016/08/Jenis-Bunga-Blue-Bells.jpg?resize=768%2C480&ssl=1"},
            {"Jenis Bunga Sepatu", "Kembang Sepatu", "https://i2.wp.com/kuyahejo.com/wp-content/uploads/2016/08/Bunga-Sepatu-Kembang-Sepatu.jpg?resize=768%2C540&ssl=1 "},
    };

    public static ArrayList<Bunga> getListData(){
        Bunga bunga= null;
        ArrayList<Bunga> list = new ArrayList<>();
        for (String[] aData : data) {
            bunga = new Bunga();
            bunga.setName(aData[0]);
            bunga.setRemarks(aData[1]);
            bunga.setPhoto(aData[2]);

            list.add(bunga);
        }

        return list;
    }
}
