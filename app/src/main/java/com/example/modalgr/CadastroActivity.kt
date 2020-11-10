package com.example.modalgr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_login.btnCadastroCadastar

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)



        btnCadastroCadastar.setOnClickListener {

            val nome = edtCadastroNome.text.toString().trim()
            val email = edtCadastroEmail.text.toString().trim().toLowerCase()
            val senha = edtCadastroSenha.text.toString().trim()


            // validação dos campos

            if (nome.isEmpty()) {

                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_LONG)
                    .show()
            } else {
                //neste pontos os campos foram preenchidos corretamente
                val sharedPrefs = getSharedPreferences("cadastro_$email",
                    MODE_PRIVATE
                )

                //obtendo a referencia de edição do arquivo
                val editPrefs = sharedPrefs.edit()

                editPrefs.putString("NOME",nome)
                editPrefs.putString("EMAIL",email)
                editPrefs.putString("SENHA",senha)

                //Salvar os dados no arquivo de shared preferences

                editPrefs.apply()

                // abrir a tela main

                val mIntent = Intent(this, MainActivity::class.java)

                // passando dados atraves de intents

                mIntent.putExtra("INTENT_EMAIL", email)

                startActivity(mIntent)

                finishAffinity()

            }


        }


    }
}