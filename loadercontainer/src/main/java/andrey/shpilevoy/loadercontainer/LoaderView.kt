package andrey.shpilevoy.loadercontainer

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout

class LoaderView(context: Context?, attrs: AttributeSet?) : FrameLayout(context, attrs) {

    init{

        val ta = context!!.obtainStyledAttributes(attrs, R.styleable.LoaderView)
        val layout = ta.getResourceId(R.styleable.LoaderView_layout, R.layout.loader)

        View.inflate(context, layout, this)
        visibility = View.GONE

        setOnClickListener(null)
        isSoundEffectsEnabled = false

    }

    fun show(){
        visibility = View.VISIBLE
    }

    fun hide(){
        visibility = View.GONE
    }

    fun isShow() : Boolean{
        return visibility == View.VISIBLE
    }

}