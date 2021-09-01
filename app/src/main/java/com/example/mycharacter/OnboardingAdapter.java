package com.example.mycharacter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OnboardingAdapter  extends RecyclerView.Adapter<OnboardingAdapter.OnboardingViewHolder> {
    
    @NonNull
    @Override
    public OnboardingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull OnboardingViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class OnboardingViewHolder extends RecyclerView.ViewHolder{
        private TextView textTitle;
        private ImageView imageOnboarding;

        public OnboardingViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitle=itemView.findViewById(R.id.textTitle);
            imageOnboarding=itemView.findViewById(R.id.imageOnboarding);
        }
        void setOnboardingData(OnboardingItem onboardingItem){
            textTitle.setText(onboardingItem.getTitle());
            imageOnboarding.setImageResource(onboardingItem.getImage());
        }
    }
}
