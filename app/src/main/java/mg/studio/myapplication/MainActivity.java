package mg.studio.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvName;

    private SessionManager session;
    private  String[] data={"lifecycle","username","layout","button_desgin","Button_ Toast","button_internet",
            "buttton_startactivity","extra","imagebutton","editext",
            "radiobuttonlistener","onclick","listview","getcolor",
            "gradient","implicitntent","weather_app","listView",
            "customAdapter","audioRecorder","database","fragment",
            "webview","servicedemo","service","fingerprint",
            "appprivatedirectory","assetsFolder","internetExtras"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view) ;
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                switch (position) {

                                                    case 0:
                                                        startActivity(new Intent(MainActivity.this, Activity01.class));
                                                        break;
                                                    case 1:
                                                        startActivity(new Intent(MainActivity.this, Activity02.class));
                                                        break;
                                                    case 2:
                                                        startActivity(new Intent(MainActivity.this, Activity03.class));
                                                        break;
                                                    case 3:
                                                        startActivity(new Intent(MainActivity.this, Activity04.class));
                                                        break;
                                                    case 4:
                                                        startActivity(new Intent(MainActivity.this, Activity05.class));
                                                        break;
                                                    case 5:
                                                        startActivity(new Intent(MainActivity.this, Activity06.class));
                                                        break;
                                                    case 6:
                                                        startActivity(new Intent(MainActivity.this, Activity07.class));
                                                        break;
                                                    case 7:
                                                        startActivity(new Intent(MainActivity.this, Activity08.class));
                                                        break;
                                                    case 8:
                                                        startActivity(new Intent(MainActivity.this, Activity09.class));
                                                        break;
                                                    case 9:
                                                        startActivity(new Intent(MainActivity.this, Activity10.class));
                                                        break;
                                                    case 10:
                                                        startActivity(new Intent(MainActivity.this, Activity11.class));
                                                        break;
                                                    case 11:
                                                        startActivity(new Intent(MainActivity.this, Activity12.class));
                                                        break;
                                                    case 12:
                                                        startActivity(new Intent(MainActivity.this, Activity13.class));
                                                        break;
                                                    case 13:
                                                        startActivity(new Intent(MainActivity.this, Activity14.class));
                                                        break;
                                                    case 14:
                                                        startActivity(new Intent(MainActivity.this, Activity15.class));
                                                        break;
                                                    case 15:
                                                        startActivity(new Intent(MainActivity.this, Activity16.class));
                                                        break;
                                                    case 16:
                                                        startActivity(new Intent(MainActivity.this, Activity17.class));
                                                        break;
                                                    case 17:
                                                        startActivity(new Intent(MainActivity.this, Activity18.class));
                                                        break;
                                                    case 18:
                                                        startActivity(new Intent(MainActivity.this, Activity19.class));
                                                        break;
                                                    case 19:
                                                        startActivity(new Intent(MainActivity.this, Activity20.class));
                                                        break;
                                                    case 20:
                                                        startActivity(new Intent(MainActivity.this, Activity21.class));
                                                        break;
                                                    case 21:
                                                        startActivity(new Intent(MainActivity.this, Activity22.class));
                                                        break;
                                                    case 22:
                                                        startActivity(new Intent(MainActivity.this, Activity23.class));
                                                        break;
                                                    case 23:
                                                        startActivity(new Intent(MainActivity.this, Activity24.class));
                                                        break;
                                                    case 24:
                                                        startActivity(new Intent(MainActivity.this, Activity25.class));
                                                        break;
                                                    case 25:
                                                        startActivity(new Intent(MainActivity.this, Activity26.class));
                                                        break;
                                                    case 26:
                                                        startActivity(new Intent(MainActivity.this, Activity27.class));
                                                        break;
                                                    case 27:
                                                        startActivity(new Intent(MainActivity.this, Activity28.class));
                                                        break;
                                                    case 28:
                                                        startActivity(new Intent(MainActivity.this, Activity29.class));
                                                        break;

                                                }
                                            }
                                        });
                /**
                 * Only logged in users should access this activity
                 */
                session = new SessionManager(getApplicationContext());
                if (!session.isLoggedIn()) {
                    logout();
                }

                /**
                 * If the user just registered an account from Register.class,
                 * the parcelable should be retrieved
                 */
                Bundle bundle = getIntent().getExtras();
                if (bundle != null) {
                    // Retrieve the parcelable
                    Feedback feedback = bundle.getParcelable("feedback");
                    // Get the from the object
                    String userName = feedback.getName();
                }


            }

            /**
             * Logging out the user:
             * - Will set isLoggedIn flag to false in SharedPreferences
             * - Clears the user data from SqLite users table
             */

            public void btnLogout(View view) {
                logout();
            }

            public void logout() {
                // Updating the session
                session.setLogin(false);
                // Redirect the user to the login activity
                startActivity(new Intent(MainActivity.this, Login.class));
                finish();
            }

        }