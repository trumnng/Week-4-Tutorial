package com.example.week4tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView name;
    private TextView symbol;
    private TextView value;
    private TextView change1h;
    private TextView change24h;
    private TextView change7d;
    private TextView marketcap;
    private TextView volume;
    private Coin mCoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

//        Coin coin = new Coin();

        Intent intent = getIntent();
        int position = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0);
        mCoin = Coin.getCoins().get(position);

        name = findViewById(R.id.txvName);
        name.setText(mCoin.getName());

        symbol = findViewById(R.id.txvSymbol);
        symbol.setText(mCoin.getSymbol());

        value = findViewById(R.id.txvValue);
        String value1 = Double.toString(mCoin.getValue());
        value.setText(value1);

        change1h = findViewById(R.id.txvChange1h);
        String change1h1 = Double.toString(mCoin.getChange1h());
        change1h.setText(change1h1);

        change24h = findViewById(R.id.txvChange24h);
        String change24h1 = Double.toString(mCoin.getChange24h());
        change24h.setText(change24h1);

        change7d = findViewById(R.id.txvChange7d);
        String change7d1 = Double.toString(mCoin.getChange7d());
        change7d.setText(change7d1);

        marketcap = findViewById(R.id.txvMarketcap);
        String marketcap1 = Double.toString(mCoin.getMarketcap());
        marketcap.setText(marketcap1);

        volume = findViewById(R.id.txvVolume);
        String volume1 = Double.toString(mCoin.getVolume());
        volume.setText(volume1);
    }
}
