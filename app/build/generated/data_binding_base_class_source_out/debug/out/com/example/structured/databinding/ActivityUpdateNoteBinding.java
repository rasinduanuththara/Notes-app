// Generated by view binder compiler. Do not edit!
package com.example.structured.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.structured.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityUpdateNoteBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText editdescription;

  @NonNull
  public final EditText editnotetitle;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final ImageButton updatebtn;

  private ActivityUpdateNoteBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText editdescription, @NonNull EditText editnotetitle,
      @NonNull TextView textView5, @NonNull ImageButton updatebtn) {
    this.rootView = rootView;
    this.editdescription = editdescription;
    this.editnotetitle = editnotetitle;
    this.textView5 = textView5;
    this.updatebtn = updatebtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUpdateNoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUpdateNoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_update_note, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUpdateNoteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.editdescription;
      EditText editdescription = ViewBindings.findChildViewById(rootView, id);
      if (editdescription == null) {
        break missingId;
      }

      id = R.id.editnotetitle;
      EditText editnotetitle = ViewBindings.findChildViewById(rootView, id);
      if (editnotetitle == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.updatebtn;
      ImageButton updatebtn = ViewBindings.findChildViewById(rootView, id);
      if (updatebtn == null) {
        break missingId;
      }

      return new ActivityUpdateNoteBinding((ConstraintLayout) rootView, editdescription,
          editnotetitle, textView5, updatebtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
