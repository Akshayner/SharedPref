package akshay.nit.sharedpref

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.register.*

class Register:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v = inflater.inflate(R.layout.register,container,false)

        var spf = activity!!.getSharedPreferences("mypref",Context.MODE_PRIVATE)
        var spe = spf.edit()
        spe.putString("uname",et1.text.toString())
        spe.putString("pass",et2.text.toString())
        spe.putString("email",et3.text.toString())
        spe.putString("mob",et4.text.toString())
        spe.commit()

        var fm = activity!!.supportFragmentManager
        var tx = fm.beginTransaction()
        tx.replace(R.id.frag,Login())
        tx.commit()


        return v
    }
}