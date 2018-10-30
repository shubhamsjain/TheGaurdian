//package com.lenovo.thegaurdian.Utils;
//
//import android.content.DialogInterface;
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AlertDialog;
//import android.support.v7.app.AppCompatDialogFragment;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.widget.Button;
//
//import com.lenovo.thegaurdian.R;
//
///**
// * Created by LENOVO on 28-10-2018.
// */
//
//public class Dialog extends AppCompatDialogFragment {
//
//    private Button dpndnt;
//    private Button cr_tkr;
//
//    @Override
//    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
//        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
//        LayoutInflater layoutInflater=getActivity().getLayoutInflater();
//        View view=layoutInflater.inflate(R.layout.activity_dialog,null);
//
//        builder.setView(view).setNegativeButton("cancel", new DialogInterface.OnClickListener() {
//
//            @Override
//            public void onClick(DialogInterface dialogInterface,int i){  }
//
//
//
//        });
//
//
//
////        dpndnt=view.findViewById(R.id.dependent);
////        cr_tkr=view.findViewById(R.id.care_taker);
//
//        return builder.create();
//    }
//}
