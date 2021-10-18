package com.hello.ogroni.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.hello.ogroni.com.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list = new ArrayList<>();
        list.add("First position");
        list.add("Second position");
        list.add("Third position");
        list.add("Fourth position");
        list.add("Fifth position");
        list.add("Sixth position");
        list.add("Seventh position");
        list.add("Eighth position");
        list.add("Ninth position");
        list.add("Tenth position");
        list.add("Eleventh position");
        list.add("Twelfth position");
    }

    /*
    public void runOne(View view) {
        binding.middleNumber.setText("1");
        binding.footerTxt.setText(list.get(0));
    }
    */


    public void runOne(View view) {
        String onePos = binding.onePositionTxt.getText().toString();
        binding.middleNumber.setText(onePos);
        binding.footerTxt.setText(list.get(0));
    }

    public void runTwo(View view) {
        String twoPos = binding.twoPositionTxt.getText().toString();
        binding.middleNumber.setText(twoPos);
        binding.footerTxt.setText(list.get(1));
    }

    public void runThree(View view) {
        String threePos = binding.threePositionTxt.getText().toString();
        binding.middleNumber.setText(threePos);
        binding.footerTxt.setText(list.get(2));
    }

    public void runFour(View view) {
        String fourPos = binding.fourPositionTxt.getText().toString();
        binding.middleNumber.setText(fourPos);
        binding.footerTxt.setText(list.get(3));
    }

    public void runFive(View view) {
        String fivePos = binding.fivePositionTxt.getText().toString();
        binding.middleNumber.setText(fivePos);
        binding.footerTxt.setText(list.get(4));
    }

    public void runSix(View view) {
        String sixPos = binding.sixPositionTxt.getText().toString();
        binding.middleNumber.setText(sixPos);
        binding.footerTxt.setText(list.get(5));
    }

    public void runSeven(View view){
        String sevenPos = binding.sevenPositionTxt.getText().toString();
        binding.middleNumber.setText(sevenPos);
        binding.footerTxt.setText(list.get(6));
    }

    public void runEight(View view){
        String eightPos = binding.eightPositionTxt.getText().toString();
        binding.middleNumber.setText(eightPos);
        binding.footerTxt.setText(list.get(7));
    }

    public void runNine(View view){
        String ninePos = binding.ninePositionTxt.getText().toString();
        binding.middleNumber.setText(ninePos);
        binding.footerTxt.setText(list.get(8));
    }

    public void runTen(View view){
        String tenPos = binding.tenPositionTxt.getText().toString();
        binding.middleNumber.setText(tenPos);
        binding.footerTxt.setText(list.get(9));
    }

    public void runEleven(View view){
        String elevenPos = binding.elevenPositionTxt.getText().toString();
        binding.middleNumber.setText(elevenPos);
        binding.footerTxt.setText(list.get(10));
    }

    public void runTwelve(View view){
        String twelvePos = binding.twelvePositionTxt.getText().toString();
        binding.middleNumber.setText(twelvePos);
        binding.footerTxt.setText(list.get(11));
    }

    public void CallNow(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", binding.middleNumber.getText().toString(), null));
        startActivity(intent);
    }
}