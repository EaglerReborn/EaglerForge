package net.lax1dude.eaglercraft.v1_8.opengl.ext.deferred.program;

/**
 * Copyright (c) 2023 LAX1DUDE. All Rights Reserved.
 * 
 * WITH THE EXCEPTION OF PATCH FILES, MINIFIED JAVASCRIPT, AND ALL FILES
 * NORMALLY FOUND IN AN UNMODIFIED MINECRAFT RESOURCE PACK, YOU ARE NOT ALLOWED
 * TO SHARE, DISTRIBUTE, OR REPURPOSE ANY FILE USED BY OR PRODUCED BY THE
 * SOFTWARE IN THIS REPOSITORY WITHOUT PRIOR PERMISSION FROM THE PROJECT AUTHOR.
 * 
 * NOT FOR COMMERCIAL OR MALICIOUS USE
 * 
 * (please read the 'LICENSE' file this repo's root directory for more info) 
 * 
 */
public class ShaderCompileException extends ShaderException {

	public final int stage;
	public final String fileName;

	public ShaderCompileException(String shaderName, int stage, String fileName, String msg) {
		super(shaderName, msg);
		this.stage = stage;
		this.fileName = fileName;
	}

}
