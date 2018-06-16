package com.bishram.scorekeeper;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private ImageButton ibCGoalTeamA, ibLGoalTeamA, ibHGoalTeamA, ibSGoalTeamA, ibFGoalTeamA, ibCornerGoalTeamA;
    private ImageButton ibCGoalTeamB, ibLGoalTeamB, ibHGoalTeamB, ibSGoalTeamB, ibFGoalTeamB, ibCornerGoalTeamB;
    private TextView tvCGoalTeamA, tvLGoalTeamA, tvHGoalTeamA, tvSGoalTeamA, tvFGoalTeamA, tvCornerGoalTeamA;
    private TextView tvCGoalTeamB, tvLGoalTeamB, tvHGoalTeamB, tvSGoalTeamB, tvFGoalTeamB, tvCornerGoalTeamB;

    private int score_CGTA = 0, score_LGTA = 0, score_HGTA = 0, score_SGTA = 0, score_FGTA = 0, score_CornerGTA = 0;
    private int score_CGTB = 0, score_LGTB = 0, score_HGTB = 0, score_SGTB = 0, score_FGTB = 0, score_CornerGTB = 0;

    private static final int MAX_SCORE = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        readLayoutIds();
        setDefaultScores();
    }

    public void readLayoutIds() {
        ibCGoalTeamA = findViewById(R.id.id_ah_ib_tac);
        ibLGoalTeamA = findViewById(R.id.id_ah_ib_tal);
        ibHGoalTeamA = findViewById(R.id.id_ah_ib_tah);
        ibSGoalTeamA = findViewById(R.id.id_ah_ib_tas);
        ibFGoalTeamA = findViewById(R.id.id_ah_ib_taf);
        ibCornerGoalTeamA = findViewById(R.id.id_ah_ib_ta_cor);

        ibCGoalTeamB = findViewById(R.id.id_ah_ib_tbc);
        ibLGoalTeamB = findViewById(R.id.id_ah_ib_tbl);
        ibHGoalTeamB = findViewById(R.id.id_ah_ib_tbh);
        ibSGoalTeamB = findViewById(R.id.id_ah_ib_tbs);
        ibFGoalTeamB = findViewById(R.id.id_ah_ib_tbf);
        ibCornerGoalTeamB = findViewById(R.id.id_ah_ib_tb_cor);

        tvCGoalTeamA = findViewById(R.id.id_ah_tv_tac);
        tvLGoalTeamA = findViewById(R.id.id_ah_tv_tal);
        tvHGoalTeamA = findViewById(R.id.id_ah_tv_tah);
        tvSGoalTeamA = findViewById(R.id.id_ah_tv_tas);
        tvFGoalTeamA = findViewById(R.id.id_ah_tv_taf);
        tvCornerGoalTeamA = findViewById(R.id.id_ah_tv_ta_corner);

        tvCGoalTeamB = findViewById(R.id.id_ah_tv_tbc);
        tvLGoalTeamB = findViewById(R.id.id_ah_tv_tbl);
        tvHGoalTeamB = findViewById(R.id.id_ah_tv_tbh);
        tvSGoalTeamB = findViewById(R.id.id_ah_tv_tbs);
        tvFGoalTeamB = findViewById(R.id.id_ah_tv_tbf);
        tvCornerGoalTeamB = findViewById(R.id.id_ah_tv_tb_cor);
    }

    public void setDefaultScores() {
        tvCGoalTeamA.setText(String.valueOf(score_CGTA));
        tvLGoalTeamA.setText(String.valueOf(score_LGTA));
        tvHGoalTeamA.setText(String.valueOf(score_HGTA));
        tvSGoalTeamA.setText(String.valueOf(score_SGTA));
        tvFGoalTeamA.setText(String.valueOf(score_FGTA));
        tvCornerGoalTeamA.setText(String.valueOf(score_CornerGTA));

        tvCGoalTeamB.setText(String.valueOf(score_CGTB));
        tvLGoalTeamB.setText(String.valueOf(score_LGTB));
        tvHGoalTeamB.setText(String.valueOf(score_HGTB));
        tvSGoalTeamB.setText(String.valueOf(score_SGTB));
        tvFGoalTeamB.setText(String.valueOf(score_FGTB));
        tvCornerGoalTeamB.setText(String.valueOf(score_CornerGTB));
    }

    public void increaseGoalFoul(View view) {
        switch (view.getId()) {
            case R.id.id_ah_ib_tac:
                score_CGTA += 1;
                if (score_CGTA > MAX_SCORE) {
                    score_CGTA = MAX_SCORE;
                    ibCGoalTeamA.setEnabled(false);
                    myToast("Information!\nImpossible to goal 50!");
                }
                tvCGoalTeamA.setText(String.valueOf(score_CGTA));
                break;

            case R.id.id_ah_ib_tal:
                score_LGTA += 1;
                if (score_LGTA > MAX_SCORE) {
                    score_LGTA = MAX_SCORE;
                    ibLGoalTeamA.setEnabled(false);
                    myToast("Information!\nImpossible to goal 50!");
                }
                tvLGoalTeamA.setText(String.valueOf(score_LGTA));
                break;

            case R.id.id_ah_ib_tah:
                score_HGTA += 1;
                if (score_HGTA > MAX_SCORE) {
                    score_HGTA = MAX_SCORE;
                    ibHGoalTeamA.setEnabled(false);
                    myToast("Information!\nImpossible to goal 50!");
                }
                tvHGoalTeamA.setText(String.valueOf(score_HGTA));
                break;

            case R.id.id_ah_ib_tas:
                score_SGTA += 1;
                if (score_SGTA > MAX_SCORE) {
                    score_SGTA = MAX_SCORE;
                    ibSGoalTeamA.setEnabled(false);
                    myToast("Information!\nImpossible to goal 50!");
                }
                tvSGoalTeamA.setText(String.valueOf(score_SGTA));
                break;

            case R.id.id_ah_ib_ta_cor:
                score_CornerGTA += 1;
                if (score_CornerGTA > MAX_SCORE) {
                    score_CornerGTA = MAX_SCORE;
                    ibCornerGoalTeamA.setEnabled(false);
                    myToast("Information!\nImpossible to goal 50!");
                }
                tvCornerGoalTeamA.setText(String.valueOf(score_CornerGTA));
                break;

            case R.id.id_ah_ib_taf:
                score_FGTA += 1;
                if (score_FGTA > MAX_SCORE) {
                    score_FGTA = MAX_SCORE;
                    ibFGoalTeamA.setEnabled(false);
                    myToast("Information!\nImpossible to goal 50!");
                }
                tvFGoalTeamA.setText(String.valueOf(score_FGTA));
                break;

            case R.id.id_ah_ib_tbc:
                score_CGTB += 1;
                if (score_CGTB > MAX_SCORE) {
                    score_CGTB = MAX_SCORE;
                    ibCGoalTeamB.setEnabled(false);
                    myToast("Information!\nImpossible to goal 50!");
                }
                tvCGoalTeamB.setText(String.valueOf(score_CGTB));
                break;

            case R.id.id_ah_ib_tbl:
                score_LGTB += 1;
                if (score_LGTB > MAX_SCORE) {
                    score_LGTB = MAX_SCORE;
                    ibLGoalTeamB.setEnabled(false);
                    myToast("Information!\nImpossible to goal 50!");
                }
                tvLGoalTeamB.setText(String.valueOf(score_LGTB));
                break;

            case R.id.id_ah_ib_tbh:
                score_HGTB += 1;
                if (score_HGTB > MAX_SCORE) {
                    score_HGTB = MAX_SCORE;
                    ibHGoalTeamB.setEnabled(false);
                    myToast("Information!\nImpossible to goal 50!");
                }
                tvHGoalTeamB.setText(String.valueOf(score_HGTB));
                break;

            case R.id.id_ah_ib_tbs:
                score_SGTB += 1;
                if (score_SGTB > MAX_SCORE) {
                    score_SGTB = MAX_SCORE;
                    ibSGoalTeamB.setEnabled(false);
                    myToast("Information!\nImpossible to goal 50!");
                }
                tvSGoalTeamB.setText(String.valueOf(score_SGTB));
                break;

            case R.id.id_ah_ib_tb_cor:
                score_CornerGTB += 1;
                if (score_CornerGTB > MAX_SCORE) {
                    score_CornerGTB = MAX_SCORE;
                    ibCornerGoalTeamB.setEnabled(false);
                    myToast("Information!\nImpossible to goal 50!");
                }
                tvCornerGoalTeamB.setText(String.valueOf(score_CornerGTB));
                break;

            case R.id.id_ah_ib_tbf:
                score_FGTB += 1;
                if (score_FGTB > MAX_SCORE) {
                    score_FGTB = MAX_SCORE;
                    ibFGoalTeamB.setEnabled(false);
                    myToast("Information!\nImpossible to goal 50!");
                }
                tvFGoalTeamB.setText(String.valueOf(score_FGTB));
        }
    }

    public void resultOfGame(View view) {
        int totalScoreTA = score_CGTA*6 + score_LGTA*5 + score_HGTA*4 + score_SGTA*3 + score_CornerGTA*2 - score_FGTA;
        int totalScoreTB = score_CGTB*6 + score_LGTB*5 + score_HGTB*4 + score_SGTB*3 + score_CornerGTB*2 - score_FGTB;
        String scoreInfo = "Total score of Team A: " + totalScoreTA + "\nTotal score of Team B: " + totalScoreTB;
        if (totalScoreTA > totalScoreTB) {
            myToast("Congratulations!\nTeam A has won the TROPHY.\n" + scoreInfo);
        } else if (totalScoreTA < totalScoreTB){
            myToast("Congratulations!\nTeam B has won the TROPHY.\n" + scoreInfo);
        } else {
            myToast("Wow! Game tied.\nBoth team played well.\n" + scoreInfo);
        }
    }

    public void myDialog(String title, String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title)
                .setMessage(msg)
                .setIcon(R.drawable.ic_action_error_holo_light)
                .setCancelable(false)
                .setNegativeButton("RESET SCORE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        score_CGTA = 0;
                        score_LGTA = 0;
                        score_HGTA = 0;
                        score_SGTA = 0;
                        score_FGTA = 0;
                        score_CornerGTA = 0;
                        score_CGTB = 0;
                        score_LGTB = 0;
                        score_HGTB = 0;
                        score_SGTB = 0;
                        score_FGTB = 0;
                        score_CornerGTB = 0;
                        setDefaultScores();
                        dialog.dismiss();
                    }
                })
                .setNeutralButton("EXIT", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .show();
    }

    public void resetScores (View view) {
        score_CGTA = 0;
        score_LGTA = 0;
        score_HGTA = 0;
        score_SGTA = 0;
        score_FGTA = 0;
        score_CornerGTA = 0;
        score_CGTB = 0;
        score_LGTB = 0;
        score_HGTB = 0;
        score_SGTB = 0;
        score_FGTB = 0;
        score_CornerGTB = 0;
        setDefaultScores();
    }

    public void myToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}