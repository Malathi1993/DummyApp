package com.example.dummyapp;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import com.example.dummyapp.R;
import com.example.dummyapp.Todo1Activity;
//import com.example.myapplication.model.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Todo1Activity.class);
                startActivity(intent);
            }
        });
    }
}

   /* FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Todo1Activity.class);
                startActivity(intent);
            }
        });
    }
}
*/
    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE){
            Bundle result;
            if(data != null) {
                result = data.getExtras();
                com.example.myapplication.model.Task task = new com.example.myapplication.model.Task().Task();
                task.setTaskName(result.getString("task_name"));
                task.setTaskDescription(result.getString("task_desc"));
                task.setDate(result.getString("date"));
                taskList.add(task);
                tasksAdapter.updateItems(taskList);
                tasksAdapter.notifyDataSetChanged();
                // Toast.makeText(this, task.getTaskName()+""+task.getTaskDescription()+""+task.getDate(), Toast.LENGTH_LONG).show();
            }
        }
    }
}
*/
