package akshay.nit.sharedpref

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.login.view.*

class Login:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v = inflater.inflate(R.layout.login,container,false)

        v.reg.setOnClickListener{
            var fm = activity!!.supportFragmentManager
            var tx = fm.beginTransaction()
            tx.replace(R.id.frag,Register())
            tx.commit()
        }
        v.login.setOnClickListener{
            var spf = activity!!.getSharedPreferences("mypref",Context.MODE_PRIVATE)
            var user= spf.getString("uname","null")
            var pass= spf.getString("pass","null")

            if (user.equals(et1.text.toString()) && pass.equals(et2.text.toString())){
                var fm = activity!!.supportFragmentManager
                var tx = fm.beginTransaction()
                tx.replace(R.id.frag,Welcome())
                tx.commit()

            }
            else{
                Toast.makeText(activity,"Invalid User",Toast.LENGTH_LONG).show()
            }
        }

        return v
    }
}