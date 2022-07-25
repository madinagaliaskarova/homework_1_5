package kg.geektech.homework_1_5

import kg.geektech.homework_1_5.model.CounterModel
import kg.geektech.homework_1_5.presenter.Presenter

class Injecter {

    companion object {
        fun getPresenter() : Presenter {
            return Presenter()
        }
        fun getModel(): CounterModel{
            return CounterModel()
        }
    }
}