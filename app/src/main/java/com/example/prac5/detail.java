package com.example.prac5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class detail extends AppCompatActivity {

    private TextView title,detailTextView1, detailTextView2, detailTextView3, detailTextView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailTextView1 = findViewById(R.id.textView1);
        detailTextView2 = findViewById(R.id.textView2);
        detailTextView3 = findViewById(R.id.textView3);
        detailTextView4 = findViewById(R.id.textView4);
        title = findViewById(R.id.titleTextView);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", -1);
        title.setText(intent.getStringExtra("title"));

        switch (position) {
            case 0:
                detailTextView1.setText("Цитоплазма, ядро, мембраны - основные компоненты клетки");
                detailTextView2.setText("Органеллы - маленькие структуры в клетке, выполняющие различные функции");
                detailTextView3.setText("Строение клеток - организация внутренних компонентов клетки");
                detailTextView4.setText("Молекулы и атомы - химические составляющие клеток и их взаимодействие");
                break;
            case 1:
                detailTextView1.setText("Гены, хромосомы - основные единицы наследственности");
                detailTextView2.setText("Генетический код - инструкции для синтеза белков");
                detailTextView3.setText("Наследственность - передача генетической информации от родителей к потомству");
                detailTextView4.setText("Мутации - изменения в генетическом материале");
                break;
            case 2:
                detailTextView1.setText("Отбор, мутации - ключевые механизмы эволюции");
                detailTextView2.setText("Популяции и виды - уровни организации в биологической системе");
                detailTextView3.setText("Происхождение видов - изучение истории развития жизни на Земле");
                detailTextView4.setText("Признаки эволюции - доказательства изменения живых организмов с течением времени");
                break;
            case 3:
                detailTextView1.setText("Взаимодействие живых организмов - основа экосистем");
                detailTextView2.setText("Биологические циклы - потоки энергии и веществ в экосистемах");
                detailTextView3.setText("Биоразнообразие - многообразие жизни на Земле");
                detailTextView4.setText("Энергетические потоки - передача энергии через пищевые цепи");
                break;
            case 4:
                detailTextView1.setText("Работа органов и систем - основные функции организма");
                detailTextView2.setText("Обмен веществ - химические реакции, необходимые для поддержания жизни");
                detailTextView3.setText("Нервная регуляция - передача сигналов в нервной системе");
                detailTextView4.setText("Гомеостаз - поддержание постоянства внутренней среды организма");
                break;
            case 5:
                detailTextView1.setText("Бактерии, вирусы, грибы - основные группы микроорганизмов");
                detailTextView2.setText("Патогенные микроорганизмы - вызывающие болезни");
                detailTextView3.setText("Микробные сообщества - взаимодействие микроорганизмов в природе");
                detailTextView4.setText("Микроорганизмы и здоровье - роль микроорганизмов в поддержании здоровья");
                break;
            case 6:
                detailTextView1.setText("Взаимодействие организмов с окружающей средой - основа экологии");
                detailTextView2.setText("Биогеоценозы - взаимосвязанные сообщества организмов и их окружение");
                detailTextView3.setText("Экологические факторы - абиотические и биотические компоненты среды");
                detailTextView4.setText("Устойчивость экосистем - способность экосистемы сохранять свою структуру и функции");
                break;
            case 7:
                detailTextView1.setText("Животный мир - разнообразие животных на Земле");
                detailTextView2.setText("Классификация животных - систематическое распределение животных по видам");
                detailTextView3.setText("Животные сообщества - группы животных, совместно обитающих в определенной местности");
                detailTextView4.setText("Поведение животных - изучение характеристик и особенностей поведения животных");
                break;
            case 8:
                detailTextView1.setText("Мир растений - разнообразие растений на Земле");
                detailTextView2.setText("Морфология и анатомия растений - структура и внешний вид растений");
                detailTextView3.setText("Фотосинтез - процесс, в ходе которого растения превращают свет в энергию");
                detailTextView4.setText("Размножение растений - процессы, обеспечивающие размножение растений");
                break;
            case 9:
                detailTextView1.setText("Геном, рекомбинантная ДНК - основные концепции генетической инженерии");
                detailTextView2.setText("Клонирование - процесс создания генетически идентичных копий организмов");
                detailTextView3.setText("Генетически модифицированные организмы - организмы с измененным генетическим составом");
                detailTextView4.setText("Трансгенные культуры - растения");
                break;
        }
    }
}