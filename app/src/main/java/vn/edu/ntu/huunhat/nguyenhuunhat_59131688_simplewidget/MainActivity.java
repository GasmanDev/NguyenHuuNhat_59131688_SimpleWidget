package vn.edu.ntu.huunhat.nguyenhuunhat_59131688_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtTen;
    EditText edtNgaySinh;
    RadioGroup rdgGioiTinh;
    CheckBox cbXemPhim;
    CheckBox cbNgheNhac;
    CheckBox cbDiCafe;
    CheckBox cbONha;
    CheckBox cbVaoBep;
    EditText edtSoThichKhac;
    Button btnXacNhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }
    void addViews()
    {
        edtTen = findViewById(R.id.edtTen);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        rdgGioiTinh = findViewById(R.id.rdgGioiTinh);
        cbXemPhim = findViewById(R.id.cbXemPhim);
        cbNgheNhac = findViewById(R.id.cbNgheNhac);
        cbDiCafe = findViewById(R.id.cbDiCafe);
        cbONha = findViewById(R.id.cbONha);
        cbVaoBep = findViewById(R.id.cbVaoBep);
        edtSoThichKhac = findViewById(R.id.edtSoThichKhac);
        btnXacNhan = findViewById(R.id.btnXacNhan);
    }
    void addEvents()
    {
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xacNhan();
            }
        });
    }
    void xacNhan()
    {
        String text = "";
        text += edtTen.getText() + "\n";
        text += "Ngày sinh:\n" + edtNgaySinh.getText() + "\n";
        switch (rdgGioiTinh.getCheckedRadioButtonId())
        {
            case R.id.rbNam:
                text += "Giới tính: Nam\n";
                break;
            case R.id.rbNu:
                text += "Giới tính: Nữ\n";
                break;
        }
        text += "Sở thích:";
        if (cbXemPhim.isChecked())
            text += " Xem phim;";
        if (cbNgheNhac.isChecked())
            text += " Nghe nhạc;";
        if (cbDiCafe.isChecked())
            text += " Đi cafe với bạn bè;";
        if (cbONha.isChecked())
            text += " Ở nhà một mình;";
        if (cbVaoBep.isChecked())
            text += " Vào bếp nấu ăn;";
        text += " " + edtSoThichKhac.getText();
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}
