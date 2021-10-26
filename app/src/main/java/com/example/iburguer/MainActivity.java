package com.example.iburguer;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Bundle extras = getIntent().getExtras();

        BottomNavigationView menu_navegacao = findViewById(R.id.menu_navegacao);
        menu_navegacao.setOnNavigationItemSelectedListener(bottomNavMethod);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new PrincipalFragment(extras)).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavMethod = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment frag = null;
            switch (item.getItemId()){
                case R.id.page_home:
                    frag = new PrincipalFragment();
                break;
                case R.id.page_produtos:
                    frag = new ProdutosFragment();
                    break;
                case R.id.page_conta:
                    frag = new ContaFragment();
                    break;
                case R.id.page_pedidos_aceitos:
                    frag = new PedidosConfirmadosFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container, frag).commit();
            return true;
        }
    };
}
