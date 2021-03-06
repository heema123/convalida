package convalida.validators

import android.widget.EditText

/**
 * @author Wellington Costa on 21/06/2017.
 */
class NotEmptyValidator(editText: EditText, errorMessage: String, autoDismiss: Boolean) : AbstractValidator(editText, errorMessage, autoDismiss) {

    override fun isNotValid(value: String): Boolean {
        return value.isEmpty()
    }

}