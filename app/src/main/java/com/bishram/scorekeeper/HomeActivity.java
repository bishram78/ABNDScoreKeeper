package com.bishram.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private Button btnResult;
    private Button btnReset;
    private ImageButton ibCGoalTeamA;
    private ImageButton ibLGoalTeamA;
    private ImageButton ibHGoalTeamA;
    private ImageButton ibSGoalTeamA;
    private ImageButton ibFGoalTeamA;
    private ImageButton ibCornerGoalTeamA;
    private ImageButton ibCGoalTeamB;
    private ImageButton ibLGoalTeamB;
    private ImageButton ibHGoalTeamB;
    private ImageButton ibSGoalTeamB;
    private ImageButton ibFGoalTeamB;
    private ImageButton ibCornerGoalTeamB;
    private TextView tvCGoalTeamA;
    private TextView tvLGoalTeamA;
    private TextView tvHGoalTeamA;
    private TextView tvSGoalTeamA;
    private TextView tvFGoalTeamA;
    private TextView tvCornerGoalTeamA;
    private TextView tvCGoalTeamB;
    private TextView tvLGoalTeamB;
    private TextView tvHGoalTeamB;
    private TextView tvSGoalTeamB;
    private TextView tvFGoalTeamB;
    private TextView tvCornerGoalTeamB;

    private int scoreCGTA = 0;
    private int scoreLGTA = 0;
    private int scoreHGTA = 0;
    private int scoreSGTA = 0;
    private int scoreFGTA = 0;
    private int scoreCornerGTA = 0;
    private int scoreCGTB = 0;
    private int scoreLGTB = 0;
    private int scoreHGTB = 0;
    private int scoreSGTB = 0;
    private int scoreFGTB = 0;
    private int scoreCornerGTB = 0;
    private boolean stateCGTA = true;
    private boolean stateLGTA = true;
    private boolean stateHGTA = true;
    private boolean stateSGTA = true;
    private boolean stateFGTA = true;
    private boolean stateCornerGTA = true;
    private boolean state_CGTB = true;
    private boolean stateLGTB = true;
    private boolean stateHGTB = true;
    private boolean stateSGTB = true;
    private boolean stateFGTB = true;
    private boolean stateCornerGTB = true;
    private boolean stateBtnResult = false;
    private boolean stateBtnReset = false;

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
        outState.putInt(KEY_C_GOAL_TA, scoreCGTA);
        outState.putInt(KEY_L_GOAL_TA, scoreLGTA);
        outState.putInt(KEY_H_GOAL_TA, scoreHGTA);
        outState.putInt(KEY_S_GOAL_TA, scoreSGTA);
        outState.putInt(KEY_F_GOAL_TA, scoreFGTA);
        outState.putInt(KEY_COR_GOAL_TA, scoreCornerGTA);
        outState.putInt(KEY_C_GOAL_TB, scoreCGTB);
        outState.putInt(KEY_L_GOAL_TB, scoreLGTB);
        outState.putInt(KEY_H_GOAL_TB, scoreHGTB);
        outState.putInt(KEY_S_GOAL_TB, scoreSGTB);
        outState.putInt(KEY_F_GOAL_TB, scoreFGTB);
        outState.putInt(KEY_COR_GOAL_TB, scoreCornerGTB);

        outState.putBoolean(KEY_CST_GOAL_TA, stateCGTA);
        outState.putBoolean(KEY_LST_GOAL_TA, stateLGTA);
        outState.putBoolean(KEY_HST_GOAL_TA, stateHGTA);
        outState.putBoolean(KEY_SST_GOAL_TA, stateSGTA);
        outState.putBoolean(KEY_FST_GOAL_TA, stateFGTA);
        outState.putBoolean(KEY_COR_ST_GOAL_TA, stateCornerGTA);
        outState.putBoolean(KEY_CST_GOAL_TB, state_CGTB);
        outState.putBoolean(KEY_LST_GOAL_TB, stateLGTB);
        outState.putBoolean(KEY_HST_GOAL_TB, stateHGTB);
        outState.putBoolean(KEY_SST_GOAL_TB, stateSGTB);
        outState.putBoolean(KEY_FST_GOAL_TB, stateFGTB);
        outState.putBoolean(KEY_COR_ST_GOAL_TB, stateCornerGTB);

        outState.putBoolean(KEY_ST_BTN_RESULT, stateBtnResult);
        outState.putBoolean(KEY_ST_BTN_RESET, stateBtnReset);
        outState.putInt(KEY_CLR_BTN_RESULT, resultBtnTxtColor);
        outState.putInt(KEY_CLR_BTN_RESET, resetBtnTxtColor);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreCGTA = savedInstanceState.getInt(KEY_C_GOAL_TA);
        scoreLGTA = savedInstanceState.getInt(KEY_L_GOAL_TA);
        scoreHGTA = savedInstanceState.getInt(KEY_H_GOAL_TA);
        scoreSGTA = savedInstanceState.getInt(KEY_S_GOAL_TA);
        scoreFGTA = savedInstanceState.getInt(KEY_F_GOAL_TA);
        scoreCornerGTA = savedInstanceState.getInt(KEY_COR_GOAL_TA);
        scoreCGTB = savedInstanceState.getInt(KEY_C_GOAL_TB);
        scoreLGTB = savedInstanceState.getInt(KEY_L_GOAL_TB);
        scoreHGTB = savedInstanceState.getInt(KEY_H_GOAL_TB);
        scoreSGTB = savedInstanceState.getInt(KEY_S_GOAL_TB);
        scoreFGTB = savedInstanceState.getInt(KEY_F_GOAL_TB);
        scoreCornerGTB = savedInstanceState.getInt(KEY_COR_GOAL_TB);

        tvCGoalTeamA.setText(String.valueOf(scoreCGTA));
        tvLGoalTeamA.setText(String.valueOf(scoreLGTA));
        tvHGoalTeamA.setText(String.valueOf(scoreHGTA));
        tvSGoalTeamA.setText(String.valueOf(scoreSGTA));
        tvFGoalTeamA.setText(String.valueOf(scoreFGTA));
        tvCornerGoalTeamA.setText(String.valueOf(scoreCornerGTA));
        tvCGoalTeamB.setText(String.valueOf(scoreCGTB));
        tvLGoalTeamB.setText(String.valueOf(scoreLGTB));
        tvHGoalTeamB.setText(String.valueOf(scoreHGTB));
        tvSGoalTeamB.setText(String.valueOf(scoreSGTB));
        tvFGoalTeamB.setText(String.valueOf(scoreFGTB));
        tvCornerGoalTeamB.setText(String.valueOf(scoreCornerGTB));

        stateCGTA = savedInstanceState.getBoolean(KEY_CST_GOAL_TA);
        stateLGTA = savedInstanceState.getBoolean(KEY_LST_GOAL_TA);
        stateHGTA = savedInstanceState.getBoolean(KEY_HST_GOAL_TA);
        stateSGTA = savedInstanceState.getBoolean(KEY_SST_GOAL_TA);
        stateFGTA = savedInstanceState.getBoolean(KEY_FST_GOAL_TA);
        stateCornerGTA = savedInstanceState.getBoolean(KEY_COR_ST_GOAL_TA);
        state_CGTB = savedInstanceState.getBoolean(KEY_CST_GOAL_TB);
        stateLGTB = savedInstanceState.getBoolean(KEY_LST_GOAL_TB);
        stateHGTB = savedInstanceState.getBoolean(KEY_HST_GOAL_TB);
        stateSGTB = savedInstanceState.getBoolean(KEY_SST_GOAL_TB);
        stateFGTB = savedInstanceState.getBoolean(KEY_FST_GOAL_TB);
        stateCornerGTB = savedInstanceState.getBoolean(KEY_COR_ST_GOAL_TB);

        ibCGoalTeamA.setEnabled(stateCGTA);
        ibLGoalTeamA.setEnabled(stateLGTA);
        ibHGoalTeamA.setEnabled(stateHGTA);
        ibSGoalTeamA.setEnabled(stateSGTA);
        ibFGoalTeamA.setEnabled(stateFGTA);
        ibCornerGoalTeamA.setEnabled(stateCornerGTA);
        ibCGoalTeamB.setEnabled(state_CGTB);
        ibLGoalTeamB.setEnabled(stateLGTB);
        ibHGoalTeamB.setEnabled(stateHGTB);
        ibSGoalTeamB.setEnabled(stateSGTB);
        ibFGoalTeamB.setEnabled(stateFGTB);
        ibCornerGoalTeamB.setEnabled(stateCornerGTB);

        stateBtnResult = savedInstanceState.getBoolean(KEY_ST_BTN_RESULT);
        stateBtnReset = savedInstanceState.getBoolean(KEY_ST_BTN_RESET);

        btnResult.setEnabled(stateBtnResult);
        btnReset.setEnabled(stateBtnReset);

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
        tvCGoalTeamA.setText(String.valueOf(scoreCGTA));
        tvLGoalTeamA.setText(String.valueOf(scoreLGTA));
        tvHGoalTeamA.setText(String.valueOf(scoreHGTA));
        tvSGoalTeamA.setText(String.valueOf(scoreSGTA));
        tvFGoalTeamA.setText(String.valueOf(scoreFGTA));
        tvCornerGoalTeamA.setText(String.valueOf(scoreCornerGTA));

        tvCGoalTeamB.setText(String.valueOf(scoreCGTB));
        tvLGoalTeamB.setText(String.valueOf(scoreLGTB));
        tvHGoalTeamB.setText(String.valueOf(scoreHGTB));
        tvSGoalTeamB.setText(String.valueOf(scoreSGTB));
        tvFGoalTeamB.setText(String.valueOf(scoreFGTB));
        tvCornerGoalTeamB.setText(String.valueOf(scoreCornerGTB));

        btnResult.setEnabled(stateBtnResult);
        resultBtnTxtColor = getResources().getColor(R.color.buttonDisableColor);
        btnResult.setTextColor(resultBtnTxtColor);

        btnReset.setEnabled(stateBtnReset);
        resetBtnTxtColor = getResources().getColor(R.color.buttonDisableColor);
        btnReset.setTextColor(resetBtnTxtColor);
    }

    public void increaseGoalFoul(View view) {
        if (countMe == 0) {
            stateBtnResult = true;
            btnResult.setEnabled(true);
            resultBtnTxtColor = getResources().getColor(R.color.whiteFF);
            btnResult.setTextColor(resultBtnTxtColor);
        }
        switch (view.getId()) {
            case R.id.id_ah_ib_tac:
                scoreCGTA++;
                countMe++;
                if (scoreCGTA > MAX_SCORE) {
                    scoreCGTA = MAX_SCORE;
                    ibCGoalTeamA.setEnabled(false);
                    stateCGTA = false;
                    myToast(getString(R.string.txt_impossible));
                }
                tvCGoalTeamA.setText(String.valueOf(scoreCGTA));
                break;

            case R.id.id_ah_ib_tal:
                scoreLGTA++;
                countMe++;
                if (scoreLGTA > MAX_SCORE) {
                    scoreLGTA = MAX_SCORE;
                    ibLGoalTeamA.setEnabled(false);
                    stateLGTA = false;
                    myToast(getString(R.string.txt_impossible));
                }
                tvLGoalTeamA.setText(String.valueOf(scoreLGTA));
                break;

            case R.id.id_ah_ib_tah:
                scoreHGTA++;
                countMe++;
                if (scoreHGTA > MAX_SCORE) {
                    scoreHGTA = MAX_SCORE;
                    ibHGoalTeamA.setEnabled(false);
                    stateHGTA = false;
                    myToast(getString(R.string.txt_impossible));
                }
                tvHGoalTeamA.setText(String.valueOf(scoreHGTA));
                break;

            case R.id.id_ah_ib_tas:
                scoreSGTA++;
                countMe++;
                if (scoreSGTA > MAX_SCORE) {
                    scoreSGTA = MAX_SCORE;
                    ibSGoalTeamA.setEnabled(false);
                    stateSGTA = false;
                    myToast(getString(R.string.txt_impossible));
                }
                tvSGoalTeamA.setText(String.valueOf(scoreSGTA));
                break;

            case R.id.id_ah_ib_ta_cor:
                scoreCornerGTA++;
                countMe++;
                if (scoreCornerGTA > MAX_SCORE) {
                    scoreCornerGTA = MAX_SCORE;
                    ibCornerGoalTeamA.setEnabled(false);
                    stateCornerGTA = false;
                    myToast(getString(R.string.txt_impossible));
                }
                tvCornerGoalTeamA.setText(String.valueOf(scoreCornerGTA));
                break;

            case R.id.id_ah_ib_taf:
                scoreFGTA++;
                countMe++;
                if (scoreFGTA > MAX_SCORE) {
                    scoreFGTA = MAX_SCORE;
                    ibFGoalTeamA.setEnabled(false);
                    stateFGTA = false;
                    myToast(getString(R.string.txt_impossible_foul));
                }
                tvFGoalTeamA.setText(String.valueOf(scoreFGTA));
                break;

            case R.id.id_ah_ib_tbc:
                scoreCGTB++;
                countMe++;
                if (scoreCGTB > MAX_SCORE) {
                    scoreCGTB = MAX_SCORE;
                    ibCGoalTeamB.setEnabled(false);
                    state_CGTB = false;
                    myToast(getString(R.string.txt_impossible));
                }
                tvCGoalTeamB.setText(String.valueOf(scoreCGTB));
                break;

            case R.id.id_ah_ib_tbl:
                scoreLGTB++;
                countMe++;
                if (scoreLGTB > MAX_SCORE) {
                    scoreLGTB = MAX_SCORE;
                    ibLGoalTeamB.setEnabled(false);
                    stateLGTB = false;
                    myToast(getString(R.string.txt_impossible));
                }
                tvLGoalTeamB.setText(String.valueOf(scoreLGTB));
                break;

            case R.id.id_ah_ib_tbh:
                scoreHGTB++;
                countMe++;
                if (scoreHGTB > MAX_SCORE) {
                    scoreHGTB = MAX_SCORE;
                    ibHGoalTeamB.setEnabled(false);
                    stateHGTB = false;
                    myToast(getString(R.string.txt_impossible));
                }
                tvHGoalTeamB.setText(String.valueOf(scoreHGTB));
                break;

            case R.id.id_ah_ib_tbs:
                scoreSGTB++;
                countMe++;
                if (scoreSGTB > MAX_SCORE) {
                    scoreSGTB = MAX_SCORE;
                    ibSGoalTeamB.setEnabled(false);
                    stateSGTB = false;
                    myToast(getString(R.string.txt_impossible));
                }
                tvSGoalTeamB.setText(String.valueOf(scoreSGTB));
                break;

            case R.id.id_ah_ib_tb_cor:
                scoreCornerGTB++;
                countMe++;
                if (scoreCornerGTB > MAX_SCORE) {
                    scoreCornerGTB = MAX_SCORE;
                    ibCornerGoalTeamB.setEnabled(false);
                    stateCornerGTB = false;
                    myToast(getString(R.string.txt_impossible));
                }
                tvCornerGoalTeamB.setText(String.valueOf(scoreCornerGTB));
                break;

            case R.id.id_ah_ib_tbf:
                scoreFGTB++;
                countMe++;
                if (scoreFGTB > MAX_SCORE) {
                    scoreFGTB = MAX_SCORE;
                    ibFGoalTeamB.setEnabled(false);
                    stateFGTB = false;
                    myToast(getString(R.string.txt_impossible_foul));
                }
                tvFGoalTeamB.setText(String.valueOf(scoreFGTB));
        }
    }

    public void resultOfGame(View view) {
        int totalScoreTA = scoreCGTA *6 + scoreLGTA *5 + scoreHGTA *4 + scoreSGTA *3 + scoreCornerGTA *2 - scoreFGTA;
        int totalScoreTB = scoreCGTB *6 + scoreLGTB *5 + scoreHGTB *4 + scoreSGTB *3 + scoreCornerGTB *2 - scoreFGTB;

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
        stateBtnResult = false;
        resultBtnTxtColor = getResources().getColor(R.color.buttonDisableColor);
        btnResult.setTextColor(resultBtnTxtColor);
        btnReset.setEnabled(true);
        stateBtnReset = true;
        resetBtnTxtColor = getResources().getColor(R.color.whiteFF);
        btnReset.setTextColor(resetBtnTxtColor);
        handleTF(false);
    }

    public void resetScores(View view) {
        countMe = 0;
        scoreCGTA = 0;
        scoreLGTA = 0;
        scoreHGTA = 0;
        scoreSGTA = 0;
        scoreFGTA = 0;
        scoreCornerGTA = 0;
        scoreCGTB = 0;
        scoreLGTB = 0;
        scoreHGTB = 0;
        scoreSGTB = 0;
        scoreFGTB = 0;
        scoreCornerGTB = 0;
        setDefault();
        handleTF(true);
        btnReset.setEnabled(false);
        stateBtnReset = false;
    }

    public void handleTF(boolean state) {
        stateCGTA = state;
        stateLGTA = state;
        stateHGTA = state;
        stateSGTA = state;
        stateFGTA = state;
        stateCornerGTA = state;
        state_CGTB = state;
        stateLGTB = state;
        stateHGTB = state;
        stateSGTB = state;
        stateFGTB = state;
        stateCornerGTB = state;

        ibCGoalTeamA.setEnabled(stateCGTA);
        ibLGoalTeamA.setEnabled(stateLGTA);
        ibHGoalTeamA.setEnabled(stateHGTA);
        ibSGoalTeamA.setEnabled(stateSGTA);
        ibFGoalTeamA.setEnabled(stateFGTA);
        ibCornerGoalTeamA.setEnabled(stateCornerGTA);
        ibCGoalTeamB.setEnabled(state_CGTB);
        ibLGoalTeamB.setEnabled(stateLGTB);
        ibHGoalTeamB.setEnabled(stateHGTB);
        ibSGoalTeamB.setEnabled(stateSGTB);
        ibFGoalTeamB.setEnabled(stateFGTB);
        ibCornerGoalTeamB.setEnabled(stateCornerGTB);
    }
    public void myToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}