package com.bishram.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private Button btnResult, btnReset;
    private ImageButton ibCGoalTeamA, ibLGoalTeamA, ibHGoalTeamA, ibSGoalTeamA, ibFGoalTeamA, ibCornerGoalTeamA;
    private ImageButton ibCGoalTeamB, ibLGoalTeamB, ibHGoalTeamB, ibSGoalTeamB, ibFGoalTeamB, ibCornerGoalTeamB;
    private TextView tvCGoalTeamA, tvLGoalTeamA, tvHGoalTeamA, tvSGoalTeamA, tvFGoalTeamA, tvCornerGoalTeamA;
    private TextView tvCGoalTeamB, tvLGoalTeamB, tvHGoalTeamB, tvSGoalTeamB, tvFGoalTeamB, tvCornerGoalTeamB;

    private int score_CGTA = 0, score_LGTA = 0, score_HGTA = 0, score_SGTA = 0, score_FGTA = 0, score_CornerGTA = 0;
    private int score_CGTB = 0, score_LGTB = 0, score_HGTB = 0, score_SGTB = 0, score_FGTB = 0, score_CornerGTB = 0;
    private boolean state_CGTA = true, state_LGTA = true, state_HGTA = true, state_SGTA = true, state_FGTA = true, state_CornerGTA = true;
    private boolean state_CGTB = true, state_LGTB = true, state_HGTB = true, state_SGTB = true, state_FGTB = true, state_CornerGTB = true;
    private boolean state_btn_result = false, state_btn_reset = false;

    private int resultBtnTxtColor;
    private int resetBtnTxtColor;

    private int countMe = 0;
    private static final int MAX_SCORE = 50;
    private static final String KEY_C_GOAL_TA = "key_c_goal_ta";
    private static final String KEY_L_GOAL_TA = "key_l_goal_ta";
    private static final String KEY_H_GOAL_TA = "key_h_goal_ta";
    private static final String KEY_S_GOAL_TA = "key_s_goal_ta";
    private static final String KEY_F_GOAL_TA = "key_f_goal_ta";
    private static final String KEY_COR_GOAL_TA = "key_cor_goal_ta";
    private static final String KEY_C_GOAL_TB = "key_c_goal_tb";
    private static final String KEY_L_GOAL_TB = "key_l_goal_tb";
    private static final String KEY_H_GOAL_TB = "key_h_goal_tb";
    private static final String KEY_S_GOAL_TB = "key_s_goal_tb";
    private static final String KEY_F_GOAL_TB = "key_f_goal_tb";
    private static final String KEY_COR_GOAL_TB = "key_cor_goal_tb";
    private static final String KEY_CST_GOAL_TA = "key_cst_goal_ta";
    private static final String KEY_LST_GOAL_TA = "key_lst_goal_ta";
    private static final String KEY_HST_GOAL_TA = "key_hst_goal_ta";
    private static final String KEY_SST_GOAL_TA = "key_sst_goal_ta";
    private static final String KEY_FST_GOAL_TA = "key_fst_goal_ta";
    private static final String KEY_COR_ST_GOAL_TA = "key_cor_st_goal_ta";
    private static final String KEY_CST_GOAL_TB = "key_cst_goal_tb";
    private static final String KEY_LST_GOAL_TB = "key_lst_goal_tb";
    private static final String KEY_HST_GOAL_TB = "key_hst_goal_tb";
    private static final String KEY_SST_GOAL_TB = "key_sst_goal_tb";
    private static final String KEY_FST_GOAL_TB = "key_fst_goal_tb";
    private static final String KEY_COR_ST_GOAL_TB = "key_cor_st_goal_tb";
    private static final String KEY_ST_BTN_RESULT = "key_st_btn_result";
    private static final String KEY_ST_BTN_RESET = "key_st_btn_reset";
    private static final String KEY_CLR_BTN_RESULT = "key_clr_btn_result";
    private static final String KEY_CLR_BTN_RESET = "key_clr_btn_reset";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        readLayoutIds();
        setDefault();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_C_GOAL_TA, score_CGTA);
        outState.putInt(KEY_L_GOAL_TA, score_LGTA);
        outState.putInt(KEY_H_GOAL_TA, score_HGTA);
        outState.putInt(KEY_S_GOAL_TA, score_SGTA);
        outState.putInt(KEY_F_GOAL_TA, score_FGTA);
        outState.putInt(KEY_COR_GOAL_TA, score_CornerGTA);
        outState.putInt(KEY_C_GOAL_TB, score_CGTB);
        outState.putInt(KEY_L_GOAL_TB, score_LGTB);
        outState.putInt(KEY_H_GOAL_TB, score_HGTB);
        outState.putInt(KEY_S_GOAL_TB, score_SGTB);
        outState.putInt(KEY_F_GOAL_TB, score_FGTB);
        outState.putInt(KEY_COR_GOAL_TB, score_CornerGTB);

        outState.putBoolean(KEY_CST_GOAL_TA, state_CGTA);
        outState.putBoolean(KEY_LST_GOAL_TA, state_LGTA);
        outState.putBoolean(KEY_HST_GOAL_TA, state_HGTA);
        outState.putBoolean(KEY_SST_GOAL_TA, state_SGTA);
        outState.putBoolean(KEY_FST_GOAL_TA, state_FGTA);
        outState.putBoolean(KEY_COR_ST_GOAL_TA, state_CornerGTA);
        outState.putBoolean(KEY_CST_GOAL_TB, state_CGTB);
        outState.putBoolean(KEY_LST_GOAL_TB, state_LGTB);
        outState.putBoolean(KEY_HST_GOAL_TB, state_HGTB);
        outState.putBoolean(KEY_SST_GOAL_TB, state_SGTB);
        outState.putBoolean(KEY_FST_GOAL_TB, state_FGTB);
        outState.putBoolean(KEY_COR_ST_GOAL_TB, state_CornerGTB);

        outState.putBoolean(KEY_ST_BTN_RESULT, state_btn_result);
        outState.putBoolean(KEY_ST_BTN_RESET, state_btn_reset);
        outState.putInt(KEY_CLR_BTN_RESULT, resultBtnTxtColor);
        outState.putInt(KEY_CLR_BTN_RESET, resetBtnTxtColor);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        score_CGTA = savedInstanceState.getInt(KEY_C_GOAL_TA);
        score_LGTA = savedInstanceState.getInt(KEY_L_GOAL_TA);
        score_HGTA = savedInstanceState.getInt(KEY_H_GOAL_TA);
        score_SGTA = savedInstanceState.getInt(KEY_S_GOAL_TA);
        score_FGTA = savedInstanceState.getInt(KEY_F_GOAL_TA);
        score_CornerGTA = savedInstanceState.getInt(KEY_COR_GOAL_TA);
        score_CGTB = savedInstanceState.getInt(KEY_C_GOAL_TB);
        score_LGTB = savedInstanceState.getInt(KEY_L_GOAL_TB);
        score_HGTB = savedInstanceState.getInt(KEY_H_GOAL_TB);
        score_SGTB = savedInstanceState.getInt(KEY_S_GOAL_TB);
        score_FGTB = savedInstanceState.getInt(KEY_F_GOAL_TB);
        score_CornerGTB = savedInstanceState.getInt(KEY_COR_GOAL_TB);

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

        state_CGTA = savedInstanceState.getBoolean(KEY_CST_GOAL_TA);
        state_LGTA = savedInstanceState.getBoolean(KEY_LST_GOAL_TA);
        state_HGTA = savedInstanceState.getBoolean(KEY_HST_GOAL_TA);
        state_SGTA = savedInstanceState.getBoolean(KEY_SST_GOAL_TA);
        state_FGTA = savedInstanceState.getBoolean(KEY_FST_GOAL_TA);
        state_CornerGTA = savedInstanceState.getBoolean(KEY_COR_ST_GOAL_TA);
        state_CGTB = savedInstanceState.getBoolean(KEY_CST_GOAL_TB);
        state_LGTB = savedInstanceState.getBoolean(KEY_LST_GOAL_TB);
        state_HGTB = savedInstanceState.getBoolean(KEY_HST_GOAL_TB);
        state_SGTB = savedInstanceState.getBoolean(KEY_SST_GOAL_TB);
        state_FGTB = savedInstanceState.getBoolean(KEY_FST_GOAL_TB);
        state_CornerGTB = savedInstanceState.getBoolean(KEY_COR_ST_GOAL_TB);

        ibCGoalTeamA.setEnabled(state_CGTA);
        ibLGoalTeamA.setEnabled(state_LGTA);
        ibHGoalTeamA.setEnabled(state_HGTA);
        ibSGoalTeamA.setEnabled(state_SGTA);
        ibFGoalTeamA.setEnabled(state_FGTA);
        ibCornerGoalTeamA.setEnabled(state_CornerGTA);
        ibCGoalTeamB.setEnabled(state_CGTB);
        ibLGoalTeamB.setEnabled(state_LGTB);
        ibHGoalTeamB.setEnabled(state_HGTB);
        ibSGoalTeamB.setEnabled(state_SGTB);
        ibFGoalTeamB.setEnabled(state_FGTB);
        ibCornerGoalTeamB.setEnabled(state_CornerGTB);

        state_btn_result = savedInstanceState.getBoolean(KEY_ST_BTN_RESULT);
        state_btn_reset = savedInstanceState.getBoolean(KEY_ST_BTN_RESET);

        btnResult.setEnabled(state_btn_result);
        btnReset.setEnabled(state_btn_reset);

        resultBtnTxtColor = savedInstanceState.getInt(KEY_CLR_BTN_RESULT);
        resetBtnTxtColor = savedInstanceState.getInt(KEY_CLR_BTN_RESET);

        btnResult.setTextColor(resultBtnTxtColor);
        btnReset.setTextColor(resetBtnTxtColor);
    }

    public void readLayoutIds() {
        btnResult = findViewById(R.id.id_ah_btn_result);
        btnReset = findViewById(R.id.id_ah_btn_reset);

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

    public void setDefault() {
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

        btnResult.setEnabled(state_btn_result);
        resultBtnTxtColor = getResources().getColor(R.color.buttonDisableColor);
        btnResult.setTextColor(resultBtnTxtColor);

        btnReset.setEnabled(state_btn_reset);
        resetBtnTxtColor = getResources().getColor(R.color.buttonDisableColor);
        btnReset.setTextColor(resetBtnTxtColor);
    }

    public void increaseGoalFoul(View view) {
        if (countMe == 0) {
            state_btn_result = true;
            btnResult.setEnabled(true);
            resultBtnTxtColor = getResources().getColor(R.color.whiteFF);
            btnResult.setTextColor(resultBtnTxtColor);
        }
        switch (view.getId()) {
            case R.id.id_ah_ib_tac:
                score_CGTA++;
                countMe++;
                if (score_CGTA > MAX_SCORE) {
                    score_CGTA = MAX_SCORE;
                    ibCGoalTeamA.setEnabled(false);
                    state_CGTA = false;
                    myToast(getString(R.string.txt_impossible));
                }
                tvCGoalTeamA.setText(String.valueOf(score_CGTA));
                break;

            case R.id.id_ah_ib_tal:
                score_LGTA++;
                countMe++;
                if (score_LGTA > MAX_SCORE) {
                    score_LGTA = MAX_SCORE;
                    ibLGoalTeamA.setEnabled(false);
                    state_LGTA = false;
                    myToast(getString(R.string.txt_impossible));
                }
                tvLGoalTeamA.setText(String.valueOf(score_LGTA));
                break;

            case R.id.id_ah_ib_tah:
                score_HGTA++;
                countMe++;
                if (score_HGTA > MAX_SCORE) {
                    score_HGTA = MAX_SCORE;
                    ibHGoalTeamA.setEnabled(false);
                    state_HGTA = false;
                    myToast(getString(R.string.txt_impossible));
                }
                tvHGoalTeamA.setText(String.valueOf(score_HGTA));
                break;

            case R.id.id_ah_ib_tas:
                score_SGTA++;
                countMe++;
                if (score_SGTA > MAX_SCORE) {
                    score_SGTA = MAX_SCORE;
                    ibSGoalTeamA.setEnabled(false);
                    state_SGTA = false;
                    myToast(getString(R.string.txt_impossible));
                }
                tvSGoalTeamA.setText(String.valueOf(score_SGTA));
                break;

            case R.id.id_ah_ib_ta_cor:
                score_CornerGTA++;
                countMe++;
                if (score_CornerGTA > MAX_SCORE) {
                    score_CornerGTA = MAX_SCORE;
                    ibCornerGoalTeamA.setEnabled(false);
                    state_CornerGTA = false;
                    myToast(getString(R.string.txt_impossible));
                }
                tvCornerGoalTeamA.setText(String.valueOf(score_CornerGTA));
                break;

            case R.id.id_ah_ib_taf:
                score_FGTA++;
                countMe++;
                if (score_FGTA > MAX_SCORE) {
                    score_FGTA = MAX_SCORE;
                    ibFGoalTeamA.setEnabled(false);
                    state_FGTA = false;
                    myToast(getString(R.string.txt_impossible_foul));
                }
                tvFGoalTeamA.setText(String.valueOf(score_FGTA));
                break;

            case R.id.id_ah_ib_tbc:
                score_CGTB++;
                countMe++;
                if (score_CGTB > MAX_SCORE) {
                    score_CGTB = MAX_SCORE;
                    ibCGoalTeamB.setEnabled(false);
                    state_CGTB = false;
                    myToast(getString(R.string.txt_impossible));
                }
                tvCGoalTeamB.setText(String.valueOf(score_CGTB));
                break;

            case R.id.id_ah_ib_tbl:
                score_LGTB++;
                countMe++;
                if (score_LGTB > MAX_SCORE) {
                    score_LGTB = MAX_SCORE;
                    ibLGoalTeamB.setEnabled(false);
                    state_LGTB = false;
                    myToast(getString(R.string.txt_impossible));
                }
                tvLGoalTeamB.setText(String.valueOf(score_LGTB));
                break;

            case R.id.id_ah_ib_tbh:
                score_HGTB++;
                countMe++;
                if (score_HGTB > MAX_SCORE) {
                    score_HGTB = MAX_SCORE;
                    ibHGoalTeamB.setEnabled(false);
                    state_HGTB = false;
                    myToast(getString(R.string.txt_impossible));
                }
                tvHGoalTeamB.setText(String.valueOf(score_HGTB));
                break;

            case R.id.id_ah_ib_tbs:
                score_SGTB++;
                countMe++;
                if (score_SGTB > MAX_SCORE) {
                    score_SGTB = MAX_SCORE;
                    ibSGoalTeamB.setEnabled(false);
                    state_SGTB = false;
                    myToast(getString(R.string.txt_impossible));
                }
                tvSGoalTeamB.setText(String.valueOf(score_SGTB));
                break;

            case R.id.id_ah_ib_tb_cor:
                score_CornerGTB++;
                countMe++;
                if (score_CornerGTB > MAX_SCORE) {
                    score_CornerGTB = MAX_SCORE;
                    ibCornerGoalTeamB.setEnabled(false);
                    state_CornerGTB = false;
                    myToast(getString(R.string.txt_impossible));
                }
                tvCornerGoalTeamB.setText(String.valueOf(score_CornerGTB));
                break;

            case R.id.id_ah_ib_tbf:
                score_FGTB++;
                countMe++;
                if (score_FGTB > MAX_SCORE) {
                    score_FGTB = MAX_SCORE;
                    ibFGoalTeamB.setEnabled(false);
                    state_FGTB = false;
                    myToast(getString(R.string.txt_impossible_foul));
                }
                tvFGoalTeamB.setText(String.valueOf(score_FGTB));
        }
    }

    public void resultOfGame(View view) {
        int totalScoreTA = score_CGTA*6 + score_LGTA*5 + score_HGTA*4 + score_SGTA*3 + score_CornerGTA*2 - score_FGTA;
        int totalScoreTB = score_CGTB*6 + score_LGTB*5 + score_HGTB*4 + score_SGTB*3 + score_CornerGTB*2 - score_FGTB;

        if (totalScoreTA > totalScoreTB) {
            String teamA = getString(R.string.txt_ah_tv_team_a);
            myToast(getResources().getString(R.string.txt_team_won, teamA, totalScoreTA, totalScoreTB));
        } else if (totalScoreTA < totalScoreTB) {
            String teamB = getString(R.string.txt_ah_tv_team_b);
            myToast(getResources().getString(R.string.txt_team_won, teamB, totalScoreTA, totalScoreTB));
        } else {
            myToast(getResources().getString(R.string.txt_game_tie, totalScoreTA, totalScoreTB));
        }

        btnResult.setEnabled(false);
        state_btn_result = false;
        resultBtnTxtColor = getResources().getColor(R.color.buttonDisableColor);
        btnResult.setTextColor(resultBtnTxtColor);
        btnReset.setEnabled(true);
        state_btn_reset = true;
        resetBtnTxtColor = getResources().getColor(R.color.whiteFF);
        btnReset.setTextColor(resetBtnTxtColor);
        handleTF(false);
    }

    public void resetScores(View view) {
        countMe = 0;
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
        setDefault();
        handleTF(true);
        btnReset.setEnabled(false);
        state_btn_reset = false;
    }

    public void handleTF(boolean state) {
        state_CGTA = state;
        state_LGTA = state;
        state_HGTA = state;
        state_SGTA = state;
        state_FGTA = state;
        state_CornerGTA = state;
        state_CGTB = state;
        state_LGTB = state;
        state_HGTB = state;
        state_SGTB = state;
        state_FGTB = state;
        state_CornerGTB = state;

        ibCGoalTeamA.setEnabled(state_CGTA);
        ibLGoalTeamA.setEnabled(state_LGTA);
        ibHGoalTeamA.setEnabled(state_HGTA);
        ibSGoalTeamA.setEnabled(state_SGTA);
        ibFGoalTeamA.setEnabled(state_FGTA);
        ibCornerGoalTeamA.setEnabled(state_CornerGTA);
        ibCGoalTeamB.setEnabled(state_CGTB);
        ibLGoalTeamB.setEnabled(state_LGTB);
        ibHGoalTeamB.setEnabled(state_HGTB);
        ibSGoalTeamB.setEnabled(state_SGTB);
        ibFGoalTeamB.setEnabled(state_FGTB);
        ibCornerGoalTeamB.setEnabled(state_CornerGTB);
    }
    public void myToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}