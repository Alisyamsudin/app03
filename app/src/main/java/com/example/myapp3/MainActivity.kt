<? versi xml = " 1.0 " encoding = " utf-8 " ?>
< RelativeLayout  xmlns : android = " http://schemas.android.com/apk/res/android "
xmlns : app = " http://schemas.android.com/apk/res-auto "
xmlns : alat = " http://schemas.android.com/tools "
android : layout_width = " match_parent "
android : layout_height = " match_parent "
android : orientasi = " vertikal "
android : background = " @drawable/background "
alat : konteks = " .MainActivity " >
< Tampilan Teks
android : layout_width = " wrap_content "
android : layout_height = " wrap_content "
android : teks = " olahraga "
android : ukuran teks = " 30sp "
android : textStyle = " tebal "
android : textColor = " @color/putih "
android : layout_margin = " 12dp " >
</ TextView >

< Tata Letak Kotak
android : layout_width = " match_parent "
android : layout_height = " wrap_content "
android : layout_marginTop = " 100dp "
android : jumlah kolom = " 2 "
android : rowCount = " 3 " >

< androidx .cardview.widget.CardView
android : layout_width = " 150dp "
android : layout_height = " 150dp "
android : layout_rowWeight = " 1 "
android : layout_columnWeight = " 1 "
android : layout_marginLeft = " 16dp "
android : layout_marginRight = " 16dp "
android : layout_marginBottom = " 16dp "
aplikasi : cardCornerRadius = " 8dp "
aplikasi : cardElevation = " 8dp " >
< Tata Letak Linier
android : layout_width = " match_parent "
android : layout_height = " wrap_content "
android : orientasi = " vertikal "
android:layout_gravity = " center_horizontal|center_vertical " >
< Tampilan Gambar
android : layout_width = " 120dp "
android : layout_height = " 120dp "
android:layout_gravity = " center_horizontal|center_vertical "
android : src = " @drawable/bulu tangkis " >
</ Tampilan Gambar >
<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_gravity="center"
android:text="badminton"
android:textColor="@color/black"
android:textSize="20sp"
android:textStyle="bold">
</TextView>
</LinearLayout>
</androidx.cardview.widget.CardView>

<androidx.cardview.widget.CardView
android:layout_width="150dp"
android:layout_height="150dp"
android : layout_rowWeight = " 1 "
android : layout_columnWeight = " 1 "
android : layout_marginLeft = " 16dp "
android : layout_marginRight = " 16dp "
android : layout_marginBottom = " 16dp "
aplikasi : cardCornerRadius = " 8dp "
aplikasi : cardElevation = " 8dp " >
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="vertical"
android:layout_gravity = "center_horizontal|center_vertical">
<ImageView
android:layout_width="120dp"
android:layout_height="120dp"
android:layout_gravity = "center_horizontal|center_vertical"
android:src="@drawable/archery">
</ImageView>
<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_gravity="center"
android:text="archery"
android:textColor="@color/black"
android:textSize="20sp"
android:textStyle="bold">
</TextView>
</LinearLayout>
</androidx.cardview.widget.CardView>

<androidx.cardview.widget.CardView
android:layout_width="150dp"
android:layout_height="150dp"
android:layout_rowWeight="1"
android:layout_columnWeight="1"
android:layout_marginLeft="16dp"
android:layout_marginRight="16dp"
android:layout_marginBottom="16dp"
app:cardCornerRadius="8dp"
app:cardElevation="8dp">
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="vertical"
android:layout_gravity = "center_horizontal|center_vertical">
<ImageView
android:layout_width="120dp"
android:layout_height="120dp"
android:layout_gravity = "center_horizontal|center_vertical"
android:src="@drawable/fencing">
</ImageView>
<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_gravity="center"
android:text="fencing"
android:textColor="@color/black"
android:textSize="20sp"
android:textStyle="bold">
</TextView>
</LinearLayout>
</androidx.cardview.widget.CardView>

<androidx.cardview.widget.CardView
android:layout_width="150dp"
android:layout_height="150dp"
android:layout_rowWeight="1"
android:layout_columnWeight="1"
android:layout_marginLeft="16dp"
android:layout_marginRight="16dp"
android:layout_marginBottom="16dp"
app:cardCornerRadius="8dp"
app:cardElevation="8dp">
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="vertical"
android:layout_gravity = "center_horizontal|center_vertical">
<ImageView
android:layout_width="120dp"
android:layout_height="120dp"
android:layout_gravity = "center_horizontal|center_vertical"
android:src="@drawable/swimming">
</ImageView>
< Tampilan Teks
android : layout_width = " wrap_content "
android : layout_height = " wrap_content "
android : layout_gravity = " tengah "
android : teks = " berenang "
android : textColor = " @color/hitam "
android : ukuran teks = " 20sp "
android : textStyle = " tebal " >
</ TextView >
</ Tata Letak Linier >
</ androidx .cardview.widget.CardView>

< androidx .cardview.widget.CardView
android : layout_width = " 150dp "
android : layout_height = " 150dp "
android : layout_rowWeight = " 1 "
android : layout_columnWeight = " 1 "
android : layout_marginLeft = " 16dp "
android : layout_marginRight = " 16dp "
android : layout_marginBottom = " 16dp "
aplikasi : cardCornerRadius = " 8dp "
aplikasi : cardElevation = " 8dp " >
< Tata Letak Linier
android : layout_width = " match_parent "
android : layout_height = " wrap_content "
android : orientasi = " vertikal "
android:layout_gravity = " center_horizontal|center_vertical " >
< Tampilan Gambar
android : layout_width = " 120dp "
android : layout_height = " 120dp "
android:layout_gravity = " center_horizontal|center_vertical "
android:src="@drawable/dumbbell">
</ImageView>
<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_gravity="center"
android:text="dumbbell"
android:textColor="@color/black"
android:textSize="20sp"
android:textStyle="bold">
</TextView>
</LinearLayout>
</androidx.cardview.widget.CardView>

<androidx.cardview.widget.CardView
android:layout_width="150dp"
android:layout_height="150dp"
android:layout_rowWeight="1"
android:layout_columnWeight="1"
android:layout_marginLeft="16dp"
android:layout_marginRight="16dp"
android:layout_marginBottom="16dp"
app:cardCornerRadius="8dp"
app:cardElevation="8dp">
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="vertical"
android:layout_gravity = "center_horizontal|center_vertical">
<ImageView
android:layout_width="110dp"
android:layout_height="110dp"
android:layout_gravity = "center_horizontal|center_vertical"
android:src="@drawable/hockey">
</ImageView>
<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_gravity="center"
android:text="hockey"
android : textColor = " @color/hitam "
android : ukuran teks = " 20sp "
android : textStyle = " tebal " >
</ TextView >
</ Tata Letak Linier >
</ androidx .cardview.widget.CardView>


</ Tata Letak Kotak >

</ Tata Letak Relatif >

