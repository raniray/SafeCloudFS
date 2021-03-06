package pt.inescid.safecloudfs.utils;

import com.google.devtools.common.options.Option;
import com.google.devtools.common.options.OptionsBase;

public class SafeCloudFSOptions extends OptionsBase {



	@Option(
			name = "mount",
			abbrev = 'm',
			help = "Directory to be mount.",
			defaultValue = "")
	public String mountDirectory;

	@Option(
			name = "config",
			abbrev = 'c',
			help = "Config file path.",
			defaultValue = "")
	public String configFile;



	@Option(
			name = "debug",
			abbrev = 'd',
			help = "Execute with debug log messages (ALL, SIMPLE, WARNING, SEVERE, INFO, FINE, FINER, FINEST).",
			defaultValue = "")
	public String debug;



	@Option(
			name = "uid",
			abbrev = 'u',
			help = "Id of the current user.",
			defaultValue = "0")
	public long uid;


	@Option(
			name = "gid",
			abbrev = 'g',
			help = "Id of the group of the current user.",
			defaultValue = "0")
	public long gid;


}
