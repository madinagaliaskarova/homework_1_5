package kg.geektech.homework_1_5.presenter

import kg.geektech.homework_1_5.model.CounterModel
import kg.geektech.homework_1_5.view.CounterView

class Presenter {
    lateinit var view: CounterView

    val model = CounterModel()


    fun increment() {
        model.increment()
        view.updateCount(model.count)
        when {
            model.count==10 -> {
                view.showToastPlusTen()
            }
            model.count==15 -> {
                view.greenColor()
            }
            model.count != 15 -> {
                view.defaultTextColor()
            }
        }


    }

    fun attachView (view : CounterView) {
        this.view = view
    }
}