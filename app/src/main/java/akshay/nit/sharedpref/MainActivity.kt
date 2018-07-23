package akshay.nit.sharedpref

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var fm = supportFragmentManager
        var tx = fm.beginTransaction()
        tx.add(R.id.frag,Login())
        tx.commit()
    }
}
