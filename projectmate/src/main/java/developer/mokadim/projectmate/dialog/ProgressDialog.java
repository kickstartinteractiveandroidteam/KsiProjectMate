package developer.mokadim.projectmate.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.Window;

import developer.mokadim.projectmate.R;


/**
 * Created by ahmed.elmokadem on 2015-09-20.
 * Show progress indicator.
 */
public class ProgressDialog {

    private Context context;
    private IndicatorStyle style;

    public ProgressDialog(Context context, IndicatorStyle style) {
        this.context = context;
        this.style = style;
    }

    public Dialog show() {
        // Create custom dialog object
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setGravity(Gravity.CENTER);
        dialog.getWindow().setBackgroundDrawable(
                new ColorDrawable(android.graphics.Color.TRANSPARENT));
        // Include dialog.xml file
        if (style != null) {
            switch (style) {
                case BallBeat:
                    dialog.setContentView(R.layout.ball_beat);
                    break;
                case BeatTextView:
                    dialog.setContentView(R.layout.ball_beattextview);
                    break;

                case BallClipRotate:
                    dialog.setContentView(R.layout.ball_clip_rotate);
                    break;
                case BallClipRotateMultiple:
                    dialog.setContentView(R.layout.ball_clip_rotate_multiple);
                    break;
                case BallClipRotatePulse:
                    dialog.setContentView(R.layout.ball_clip_rotate_pulse);
                    break;
                case BallGridBeat:
                    dialog.setContentView(R.layout.ball_grid_beat);
                    break;
                case BallGridPulse:
                    dialog.setContentView(R.layout.ball_grid_pulse);
                    break;
                case BallPulse:
                    dialog.setContentView(R.layout.ball_pulse);
                    break;
                case BallPulseRise:
                    dialog.setContentView(R.layout.ball_pulse_rise);
                    break;
                case BallPulseSync:
                    dialog.setContentView(R.layout.ball_pulse_sync);
                    break;
                case BallRotate:
                    dialog.setContentView(R.layout.ball_rotate);
                    break;
                case BallScale:
                    dialog.setContentView(R.layout.ball_scale);
                    break;
                case BallScaleMultiple:
                    dialog.setContentView(R.layout.ball_scale_multiple);
                    break;
                case BallScaleRipple:
                    dialog.setContentView(R.layout.ball_scale_ripple);
                    break;
                case BallScaleRippleMultiple:
                    dialog.setContentView(R.layout.ball_scale_ripple_multiple);
                    break;
                case BallSpinFadeLoader:
                    dialog.setContentView(R.layout.ball_spin_fade_loader);
                    break;
                case BallTrianglePath:
                    dialog.setContentView(R.layout.ball_triangle_path);
                    break;
                case BallZigZag:
                    dialog.setContentView(R.layout.ball_zig_zag);
                    break;
                case BallZigZagDeflect:
                    dialog.setContentView(R.layout.ball_zig_zag_deflect);
                    break;
                case CubeTransition:
                    dialog.setContentView(R.layout.cube_transition);
                    break;
                case LineScale:
                    dialog.setContentView(R.layout.line_scale);
                    break;
                case LineScaleParty:
                    dialog.setContentView(R.layout.line_scale_party);
                    break;
                case LineScalePulseOut:
                    dialog.setContentView(R.layout.line_scale_pulse_out);
                    break;
                case LineScalePulseOutRapid:
                    dialog.setContentView(R.layout.line_scale_pulse_out_rapid);
                    break;
                case LineSpinFadeLoader:
                    dialog.setContentView(R.layout.line_spin_fade_loader);
                    break;
                case Pacman:
                    dialog.setContentView(R.layout.pacman);
                    break;
                case SemiCircleSpin:
                    dialog.setContentView(R.layout.semi_circle_spin);
                    break;
                case SquareSpin:
                    dialog.setContentView(R.layout.square_spin);
                    break;
                case TriangleSkewSpin:
                    dialog.setContentView(R.layout.triangle_skew_spin);
                    break;
            }
        } else {
            dialog.setContentView(R.layout.ball_spin_fade_loader);
        }

        dialog.setCancelable(false);
        dialog.show();
        return dialog;
    }
}
