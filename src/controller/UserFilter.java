package controller;

import java.io.IOException;
import java.util.List;

import data.ReplierEmail;

public interface UserFilter {
	public List<ReplierEmail> emailReplierInPostComments() throws IOException;
}
