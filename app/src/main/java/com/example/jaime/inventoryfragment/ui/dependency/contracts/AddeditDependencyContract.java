package com.example.jaime.inventoryfragment.ui.dependency.contracts;

import com.example.jaime.inventoryfragment.data.db.model.Dependency;
import com.example.jaime.inventoryfragment.ui.base.BasePresenter;
import com.example.jaime.inventoryfragment.ui.base.BaseView;
import com.example.jaime.inventoryfragment.ui.login.LoginInteractor;

/**
 * Created by usuario on 23/11/17.
 */

public interface AddeditDependencyContract {

    interface View extends BaseView {
        void navigateToListDependency();
        void setNameEmptyError();
        void setSortNameEmptyError();
        void setSortNameLengthError();
        void setDescriptionEmptyError();
        void setValidateDependencyError();
    }


    interface Presenter extends BasePresenter {
        void saveDependency(String name, String sortName, String description);
        void editDependency(Dependency dependency);
    }


    interface Interactor {
        void validateDependecy(String name, String sortname, String description, Interactor.OnAddeditFinishedListener listener);
        void addDependency(String name, String sortname, String description);
        void editDependency(Dependency dependency,OnAddeditFinishedListener listener);

        interface OnAddeditFinishedListener {
            void onNameEmptyError();

            void onSortNameEmptyError();

            void onSortNameLengthError();

            void onDescriptionEmptyError();

            void onDependencyExists();

            void onSuccess();
        }
    }
}
