# DoubleCheckTextView


#Usage in activity_main.xml

```
<com.app.app.DoubleCheckTextView
                    android:id="@+id/cb_view"
                    setText="@{@string/title}"
                    setStatus="@{data.status}"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toTopOf="parent" />
```

#Binding Adapter Global Function

```
@androidx.databinding.BindingAdapter("setText")
fun com.app.app.DoubleCheckTextView.setText(text: String) {
    setTextContent(text)
}
@androidx.databinding.BindingAdapter("setStatus")
fun DoubleCheckTextView.setStatus(text: Int) {
    setStatusContent(text)
}


```

#Usage in MainActivity.kt

```
val checkStatus = binding.cbView.status

// checkStatus = -1    none selected
// checkStatus =  0    No selected
// checkStatus =  1    Yes selected
```
