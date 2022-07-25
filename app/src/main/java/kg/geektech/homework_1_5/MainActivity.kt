package kg.geektech.homework_1_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kg.geektech.homework_1_5.databinding.ActivityMainBinding
import kg.geektech.homework_1_5.presenter.Presenter
import kg.geektech.homework_1_5.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {
    private lateinit var binding: ActivityMainBinding
    private lateinit var presenter: Presenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = Injecter.getPresenter()
        presenter.attachView(this)
        initClicker()

    }

    private fun initClicker() {
        with(binding) {
            buttonPlus.setOnClickListener {
                presenter.increment()
            }

        }

    }

    override fun updateCount(count: Int) {
        binding.counter.text = count.toString()
    }

    override fun showToastPlusTen() {
        Toast.makeText(this, "Число равно 10", Toast.LENGTH_SHORT).show()
    }

    override fun defaultTextColor() {
        binding.counter.setTextColor(getColor(R.color.black))
    }

    override fun greenColor() {
        binding.counter.setTextColor(getColor(R.color.green))

    }


}