package akshay.nit.sharedpref

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.welcome.view.*

class Welcome:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v = inflater.inflate(R.layout.welcome,container,false)

        var spf = activity!!.getSharedPreferences("mypref",Context.MODE_PRIVATE)
        var user= spf.getString("uname","null")

        v.tv.text = "Welcome $user"

        return v
    }
}