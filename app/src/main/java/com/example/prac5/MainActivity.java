package com.example.prac5;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.prac5.adapter.CardAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CardAdapter cardAdapter;
    private List<CardItem> cardItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        cardItemList = new ArrayList<>();
        cardItemList.add(new CardItem("Клеточное строение", "Цитоплазма, ядро, мембраны", "Органеллы", "Строение клеток", "Молекулы и атомы"));
        cardItemList.add(new CardItem("Генетика", "Гены, хромосомы", "Генетический код", "Наследственность", "Мутации"));
        cardItemList.add(new CardItem("Эволюция", "Отбор, мутации", "Популяции и виды", "Происхождение видов", "Признаки эволюции"));
        cardItemList.add(new CardItem("Экосистемы", "Взаимодействие живых организмов", "Биологические циклы", "Биоразнообразие", "Энергетические потоки"));
        cardItemList.add(new CardItem("Физиология", "Работа органов и систем", "Обмен веществ", "Нервная регуляция", "Гомеостаз"));
        cardItemList.add(new CardItem("Микробиология", "Бактерии, вирусы, грибы", "Патогенные микроорганизмы", "Микробные сообщества", "Микроорганизмы и здоровье"));
        cardItemList.add(new CardItem("Экология", "Взаимодействие организмов с окружающей средой", "Биогеоценозы", "Экологические факторы", "Устойчивость экосистем"));
        cardItemList.add(new CardItem("Зоология", "Животный мир", "Классификация животных", "Животные сообщества", "Поведение животных"));
        cardItemList.add(new CardItem("Ботаника", "Мир растений", "Морфология и анатомия растений", "Фотосинтез", "Размножение растений"));
        cardItemList.add(new CardItem("Генетическая инженерия", "Геном, рекомбинантная ДНК", "Клонирование", "Генетически модифицированные организмы", "Трансгенные культуры"));

        cardAdapter = new CardAdapter(cardItemList, this);
        recyclerView.setAdapter(cardAdapter);
    }
}