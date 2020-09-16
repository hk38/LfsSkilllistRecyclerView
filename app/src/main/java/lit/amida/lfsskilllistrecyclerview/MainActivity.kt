package lit.amida.lfsskilllistrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val courseList = listOf(
            CourseData(R.drawable.android, "Androidアプリプログラミングコース", "いろんなアプリを作って，プログラミングを楽しもう！"),
            CourseData(R.drawable.iphone, "iPhoneアプリプログラミングコース", "世界に一つだけのiPhoneアプリをつくって，周りを驚かせよう！"),
            CourseData(R.drawable.unity, "Unityゲームプログラミングコース", "世界を驚かすワクワクが止まらない！　3Dゲームを制作しよう！"),
            CourseData(R.drawable.minecraft, "Mincraftプログラミングコース", "マインクラフトでJavaプログラミングを学ぼう！")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = Adapter(this)
        recyclerView.adapter = adapter

        adapter.addAll(courseList)
    }
}