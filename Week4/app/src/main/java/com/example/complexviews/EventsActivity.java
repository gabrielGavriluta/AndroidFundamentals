package com.example.complexviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventsActivity extends AppCompatActivity {

    private List<Event> events;
    private RecyclerView recyclerViewEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        getEvents();
        recyclerViewEvents = this.findViewById(R.id.recyclerViewEvents);
        setLayoutManager(recyclerViewEvents);
        setAdapter(recyclerViewEvents);
    }
    private void getEvents() {
        events = new ArrayList<>();
        Event event = null;
        for (int i = 1; i < 20; i++) {
            event = new Event();
            event.setFirstNameTxt("FirstName " + i);
            event.setLastNameTxt("LastName " + i);
            events.add(event);
        }
    }

    private void setLayoutManager(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void setAdapter(RecyclerView recyclerView) {
        EventsAdapter eventsAdapter = new EventsAdapter(events);
        recyclerView.setAdapter(eventsAdapter);
    }
}
