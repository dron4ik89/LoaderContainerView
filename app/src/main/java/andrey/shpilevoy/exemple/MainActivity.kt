package andrey.shpilevoy.exemple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        base_loader_button?.onClick{
            toast("Click")
            base_loader.show()
            Handler().postDelayed({
                base_loader.hide()
            }, 3000L)
        }

        loader1_button?.onClick{
            toast("Click")
            loader1.show()
            Handler().postDelayed({
                loader1.hide()
            }, 3000L)
        }

        loader2_button?.onClick{
            toast("Click")
            loader2.show()
            Handler().postDelayed({
                loader2.hide()
            }, 3000L)
        }
    }
}
