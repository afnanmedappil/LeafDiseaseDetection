package isomora.com.greendoctor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_details.*

class Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val title = intent.getStringExtra("title");
        titleText.text = title;

        val  data : List<Data> = Data.getValue();
        data.forEach{ item ->
            if(item.name == title){


                if(item.check ) {
                    symptomsText.text ="NO worries! Your plant is healthy" ;
                }
                else{
                    symptomsText.text = item.symptoms;
                }

                    //symptomsText.text = item.symptoms;
                    treatmentsText.text = item.treatments;
                    preventText.text = item.prevent;

                if(item.symptoms.isEmpty()){
                    symptoms.visibility = View.GONE;
                    //symptomsText.visibility = View.GONE;
                }
                if(item.treatments.isEmpty()){
                    treatments.visibility = View.GONE;
                    treatmentsText.visibility = View.GONE;
                }
                if(item.prevent.isEmpty()){
                    prevent.visibility = View.GONE;
                    preventText.visibility = View.GONE;
                }


            }
        }
//        val title = intent.getStringExtra("title");
//
//        //titleText.text = title;
//        if(title=="soybean healthy")
//        {
//            titleText.text = "soybean healthy";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="apple apple scab")
//        {
//            titleText.text = "apple scab";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="apple black rot")
//        {
//            titleText.text = "apple black rot";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="apple cedar apple rust")
//        {
//            titleText.text = "apple cedar apple rust";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="apple healthy")
//        {
//            titleText.text = "apple healthy";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="blueberry healthy")
//        {
//            titleText.text = "blueberry healthy";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="cherry including sour powdery mildew")
//        {
//            titleText.text = "cherry including sour powdery mildew";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="cherry including sour healthy")
//        {
//            titleText.text = "cherry including sour healthy";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="corn maize cercospora leaf spot gray leaf spot")
//        {
//            titleText.text = "corn maize cercospora leaf spot gray leaf spot";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="corn maize common rust ")
//        {
//            titleText.text = "corn maize common rust";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="corn maize northern leaf blight")
//        {
//            titleText.text = "corn maize northern leaf blight";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="corn maize healthy")
//        {
//            titleText.text = "corn maize healthy";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="grape black rot")
//        {
//            titleText.text = "grape black rot";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="grape esca black measles ")
//        {
//            titleText.text = "grape esca black measles ";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="grape leaf blight isariopsis leaf spot")
//        {
//            titleText.text = "grape leaf blight isariopsis leaf spot ";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="grape healthy")
//        {
//            titleText.text = "grape healthy ";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="orange haunglongbing citrus greening ")
//        {
//            titleText.text = "orange haunglongbing citrus greening  ";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="peach bacterial spot")
//        {
//            titleText.text = "peach bacterial spot";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="peach healthy")
//        {
//            titleText.text = "peach healthy";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="pepper bell bacterial spot")
//        {
//            titleText.text = "pepper bell bacterial spot";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="pepper bell healthy")
//        {
//            titleText.text = "pepper bell healthy";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="potato early blight")
//        {
//            titleText.text = "potato early blight";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="potato late blight")
//        {
//            titleText.text = "potato late blight";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="raspberry healthy")
//        {
//            titleText.text = "raspberry healthy";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="squash powdery mildew")
//        {
//            titleText.text = "squash powdery mildew";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="strawberry leaf scorch")
//        {
//            titleText.text = "strawberry leaf scorch";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="strawberry healthy")
//        {
//            titleText.text = "strawberry healthy";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="tomato bacterial spot")
//        {
//            titleText.text = "tomato bacterial spot";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="tomato early blight")
//        {
//            titleText.text = "tomato early blight";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="tomato late blight")
//        {
//            titleText.text = "tomato late blight";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="tomato leaf mold")
//        {
//            titleText.text = "tomato leaf mold";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="tomato spider mites two spotted spider mite")
//        {
//            titleText.text = "tomato spider mites two spotted spider mite";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="tomato septoria leaf spot")
//        {
//            titleText.text = "tomato septoria leaf spot";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="tomato target spot")
//        {
//            titleText.text = "tomato target spot";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="tomato tomato yellow leaf curl virus")
//        {
//            titleText.text = "tomato yellow leaf curl virus";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="tomato tomato mosaic virus")
//        {
//            titleText.text = "tomato mosaic virus";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        if(title=="tomato healthy")
//        {
//            titleText.text = "tomato healthy";
//            symptomsText.text = "a";
//            treatmentsText.text = "b";
//            preventText.text = "c";
//        }
//        else {
//
//
//            symptomsText.text = "";
//            treatmentsText.text = "";
//            preventText.text = "";
//        }
    }
}