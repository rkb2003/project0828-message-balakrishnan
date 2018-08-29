 
package project0828_message_balakrishnan;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class MessageHandler {
	@Execute
	public void execute(Shell shell) {
		MessageDialog.openInformation(shell, "Title", "Hello Plugin!");
	}
		
}