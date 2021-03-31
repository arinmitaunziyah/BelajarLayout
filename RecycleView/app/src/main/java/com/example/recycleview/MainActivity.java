package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> minuman = new ArrayList<>();
    private ArrayList<String> namaminuman = new ArrayList<>();
    private ArrayList<String> infominuman = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();

    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recycleView = findViewById(R.id.RecycleView);
        RecycleViewAdapter adapter = new RecycleViewAdapter(minuman, namaminuman, infominuman, this);

        recycleView.setAdapter(adapter);
        recycleView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        namaminuman.add("Es Dawet");
        minuman.add("https://cdn1-production-images-kly.akamaized.net/j9SYjmz2-9iwqA-VRvW47Pa03s0=/640x360/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/975038/original/008493200_1441187509-1_jogjareview_net.jpg");
        infominuman.add("Es dawet merupakan es khas Nusantara yang berasal dari Banjarnegara, Jawa Tengah. Bahan dasarnya berasal dari tepung beras yang diolah, lalu diberi tambahan pewarna hijau dari daun suji.");

        namaminuman.add("Es Timun Serut");
        minuman.add("https://cdn0-production-images-kly.akamaized.net/ZRw5Hl5coDDapk_AUKar-NuMJ9w=/640x360/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/908071/original/030915800_1435046462-es_timun_2.jpg");
        infominuman.add("Saat kita berkunjung ke restauran khas Aceh, tak lengkap kalau tidak memesan es khas Nusantara yang satu ini. Di Aceh, es timun serut selasih selalu ada di daftar menu tempat makan yang menyajikan masakan Aceh.");

        namaminuman.add("Es Doger");
        minuman.add("https://cdn1-production-images-kly.akamaized.net/q312B7LC-6gZFqdgsjl4YNn2KlQ=/640x360/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/1129048/original/031313400_1454376607-IMG_0178.jpg");
        infominuman.add("Es khas Nusantara ini berasal dari Cirebon, Jawa Barat. Doger merupakan singkatan dari \"dorong gerobak\". Minuman dengan bahan dasar santan kelapa ini biasanya berisi tape, ketan hitam, alpukat, dan potongan daging kelapa. Dapat juga ditambahkan potongan roti tawar dan sagu mutiara di dalamnya.");

        namaminuman.add("Es Lidah Buaya");
        minuman.add("https://cdn1-production-images-kly.akamaized.net/kmw6Z6v-buWIcXlKccmpHjgvN1U=/640x360/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/2812867/original/013727600_1558513662-Es_Lidah_Buaya_2.JPG");
        infominuman.add("Salah satu tanaman dengan bentuk unik ini memiliki bagian daging seperti jelly. Lidah Buaya biasanya sering menjadi bahan minuman yang sangat terkenal terutama di daerah Pontianak, Kalimantan Barat. Minuman ini biasa disebut Es Lidah Buaya. Untuk membuat Es lidah buaya ini sangat mudah dan sederhana.");

        namaminuman.add("Es Cendol");
        minuman.add("https://cdn.idntimes.com/content-images/community/2021/02/fromandroid-c148ce45a4d2690df0b8681b02494f69.jpg");
        infominuman.add("Semua orang pasti pernah coba manis gurihnya es cendol. Es cendol sangat populer dengan tampilan warna hijau dan sensasi manis yang menyegarkan serta mudah ditemukan dimanapun berada. Terbuat dari tepung beras, es cendol biasa disajikan bersama santan, gula merah cair, dan es serut.");

        namaminuman.add("Bajigur");
        minuman.add("https://cdn.idntimes.com/content-images/community/2021/02/fromandroid-280925ec3917e3bf804b1cf16b45a090.jpg");
        infominuman.add("Jika minuman es cendol memiliki cita rasa dingin menyegarkan, berbeda dengan minuman asal Jawa Barat yang justru terkenal mampu menghangatkan tubuh. Berbahan dasar gula aren, santan, jahe, dan bahan rempah lainnya. Bajigur menjadi salah satu pilihan minuman yang tepat dan cocok diseruput di saat cuaca dingin serta musim hujan seperti sekarang.");

        namaminuman.add("Bir Pletok");
        minuman.add("https://cdn.idntimes.com/content-images/community/2021/02/fromandroid-005e66106e21e1e8aefef70816f8b7e4.jpg");
        infominuman.add("Meskipun dinamakan bir petok, bukan berarti minuman tradisional ini memabukan lho. Sebab minuman asal Betawi ini dibuat dari beragam bahan rempah seperti kapulaga, serai, kayu manis, dan kayu secang. Perpaduan bahan rempah-rempah yang memberikan sensasi rasa hangat, bir pletok pun paling enak disajikan selagi dingin bersama es batu.");

        namaminuman.add("Sekoteng");
        minuman.add("https://cdn.idntimes.com/content-images/community/2021/02/fromandroid-1bb939e0ece3018e9f4dd05d324df8c8.jpg");
        infominuman.add("Selain es cendol, minuman menghangatkan yang satu ini juga berasal dari Jawa Tengah, lho. Ya, siapa sih yang gak kenal sekoteng. Dengan cita rasa menghangatkan dari bahan rempah seperti jahe. Sekoteng identik dengan beragam topping seperti kacang hijau, kacang tanah, pacar cina, dan potongan roti tawar. Jika berkunjung ke Jawa Tengah, paling pas menikmati sekoteng sembari menikmati santapan lauk angkringan yang berpadu nikmat.");

        namaminuman.add("Wedang Uwuh");
        minuman.add("https://cdn.idntimes.com/content-images/community/2021/02/fromandroid-c178250a2e65c21b454206f0310aa9a0.jpg");
        infominuman.add("Memang sebagian besar minuman tradisional Indonesia terbuat dari beragam bahan rempah-rempah. Salah satu minuman berbahan dasar rempah yang dimaksud adalah wedang uwuh, dalam bahasa Jawa wedang uwuh berarti 'minuman sampah'.\n" +
                "Namun nyatanya minuman ini terbuat dari daun organik dan bahan rempah lain. Berkat nama unik inilah minuman menghangatkan ini mampu dikenal luas oleh masyarakat Indonesia");

        namaminuman.add("Wedang Ronde");
        minuman.add("https://cdn.idntimes.com/content-images/community/2021/02/fromandroid-5c30f0f2073b325173c68b6b2c5ac251.jpg");
        infominuman.add("Minuman tradisional khas Indonesia ini memang memiliki ciri khas disajikan adanya bola-bola yang terbuat dari tepung ketan dilengkapi dengan topping lain seperti kolang-kaling, kacang tanah, dan potongan roti tawar. Selanjutnya bahan-bahan inilah disajikan dengan siraman kuah jahe yang rasanya manis menghangatkan.");


        prosesRecyclerViewAdapter();
    }

}