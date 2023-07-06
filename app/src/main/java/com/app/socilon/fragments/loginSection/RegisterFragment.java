package com.app.socilon.fragments.loginSection;

import static com.app.socilon.utils.CommomUtils.isValidEmail;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.navigation.Navigation;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.app.socilon.R;
import com.app.socilon.activities.HomeActivity;
import com.app.socilon.appModelClasses.RegisterRoot;
import com.app.socilon.databinding.FragmentRegisterBinding;
import com.app.socilon.response.ApiInterface;
import com.app.socilon.response.ViewModel;


public class RegisterFragment extends Fragment {
FragmentRegisterBinding registerBinding;
String enterEmail,enterPassword,enterRefferalCode;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        registerBinding=FragmentRegisterBinding.inflate(inflater,container,false);
        return registerBinding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClicks(view);
//        checkValidations(view);
//        findIds(view);



    }
//
//    private void findIds(View view) {
//        enterEmail=registerBinding.emailSignUp.getText().toString();
//        enterPassword=registerBinding.passwordSignUp.getText().toString();
//        enterRefferalCode=registerBinding.refferalCode.getText().toString();
//    }
//
//    private void checkValidations(View view) {
//
//        registerBinding.emailSignUp.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                if (!isValidEmail(s.toString())) {
//                    registerBinding.emailSignUp.setError("Invalid email");
//                } else {
//                    registerBinding.emailSignUp.setError(null);
//                }
//
//            }
//        });
//        registerBinding.passwordSignUp.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                if (!isValidEmail(s.toString())) {
//                    registerBinding.passwordSignUp.setError("Password must be at least 8 characters");
//
//                } else {
//                    registerBinding.passwordSignUp.setError(null);
//                }
//
//            }
//        });
//    }


    private void onClicks(View view) {
        registerBinding.signIn.setOnClickListener(view1 -> {

            Navigation.findNavController(getView()).navigate(R.id.action_registerFragment_to_loginFragment);
        });
        registerBinding.signUp.setOnClickListener(view1 -> {

            Navigation.findNavController(getView()).navigate(R.id.action_registerFragment_to_interstsFragment);

        });

        registerBinding.phoneLogin.setOnClickListener(view1 -> {

            Navigation.findNavController(getView()).navigate(R.id.action_registerFragment_to_phoneLoginFragment);

        });
    }
//
//    private void registerApi() {
//        new ViewModel().registerRootLiveData(requireActivity(), enterEmail, enterPassword, enterRefferalCode).observe(requireActivity(), new Observer<RegisterRoot>() {
//            @Override
//            public void onChanged(RegisterRoot registerRoot) {
//                if (registerRoot != null){
//                    if (registerRoot.getStatus().equals("1")){
//                        Toast.makeText(requireContext(), "Success"+registerRoot.getMessage(), Toast.LENGTH_SHORT).show();
//                            Intent intent = new Intent(requireActivity(), HomeActivity.class);
//                            startActivity(intent);
//                        Toast.makeText(requireContext(), "Click", Toast.LENGTH_SHORT).show();
//
//                    } else {
//                        Toast.makeText(requireContext(), "Root is Null", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            }
//        });
//    }
}