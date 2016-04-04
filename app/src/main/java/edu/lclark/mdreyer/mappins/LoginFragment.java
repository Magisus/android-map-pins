package edu.lclark.mdreyer.mappins;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {


    public static LoginFragment newInstance() {
        LoginFragment frag = new LoginFragment();
        return frag;
    }

    public LoginFragment() {
        // Required empty public constructor
    }

    @Bind(R.id.fragment_login_name_input_text)
    EditText usernameInput;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);

        ButterKnife.bind(this, rootView);

        return rootView;
    }

    @OnClick(R.id.login_fragment_login_button)
    public void login() {
        String username = usernameInput.getText().toString();
    }

    @OnClick(R.id.login_fragment_add_user_button)
    public void addUser() {

    }

}
