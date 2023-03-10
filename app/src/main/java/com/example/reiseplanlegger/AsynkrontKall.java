package com.example.reiseplanlegger;

import android.content.Context;


public class AsynkrontKall {

    class getBikesGPT {
        //        Nyeste forsøk på å gjøre dette basert på chatGPT:
        private MainGET mainGET = new MainGET();
        Context nyContext = null; //? sende med?
        void callGetAvailableBikes(MainGET.OnResponseListener listener) { //VOID?
            mainGET.getAvailableBikes("Kiellands plass", nyContext, listener);
        }
    }
}