package com.dev.ducpaph.assignmentandroidnw;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;


import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    FloatingActionMenu materialDesignFAM;
    FloatingActionButton floatingActionButton1, floatingActionButton2, floatingActionButton3, floatingActionButton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);

        materialDesignFAM = (FloatingActionMenu) findViewById(R.id.material_design_android_floating_action_menu);
        floatingActionButton1 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item1);
        floatingActionButton2 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item2);
        floatingActionButton3 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item3);
        floatingActionButton4 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item4);

        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Love", Toast.LENGTH_SHORT).show();
            }
        });
        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Share", Toast.LENGTH_SHORT).show();

            }
        });
        floatingActionButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Save", Toast.LENGTH_SHORT).show();

            }
        });
        floatingActionButton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Set As Background", Toast.LENGTH_SHORT).show();

            }
        });
        setTitle("Latest");
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_container, new LatestFragment()).commit();


    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

//        // Handle navigation view item clicks here.
        switch (item.getItemId()) {
            case R.id.nav_latest:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_container,
                        new LatestFragment()).commit();
                setTitle("Lates");
                break;
            case R.id.nav_category:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_container,
                        new CategoryFragment()).commit();
                setTitle("Category");
                break;
            case R.id.nav_gifs:
//                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_container,
//                        new ThongKeFragment()).commit();

                break;
            case R.id.nav_my_favorites:

                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_container,
                        new MyFavoriteFragment()).commit();
                setTitle("My Favorites");

                break;
            case R.id.nav_rate_app:
                break;
            case R.id.nav_more_App:
                break;
            case R.id.nav_about_us:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_container,
                        new AboutUsFragment()).commit();
                setTitle("About Us");

                break;
            case R.id.nav_setting:
                break;
            case R.id.nav_privacy_police:
                break;
        }
        int id = item.getItemId();

        if (id == R.id.nav_latest) {
            // Handle the camera action
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_container,
                    new LatestFragment()).commit();

        } else if (id == R.id.nav_category) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_container,
                    new CategoryFragment()).commit();

        } else if (id == R.id.nav_gifs) {

        } else if (id == R.id.nav_my_favorites) {

        } else if (id == R.id.nav_rate_app) {

        } else if (id == R.id.nav_more_App) {

        } else if (id == R.id.nav_about_us) {

        } else if (id == R.id.nav_setting) {

        } else if (id == R.id.nav_privacy_police) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
