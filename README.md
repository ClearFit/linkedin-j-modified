linkedin-j-modified
===================

WARNING: This is a fork of a fork

- Switched linkedin urls to https
- Added support for oauth2 token (note does not generate the token, only gives you the option to use it)



Original Modifications

Linkedin-j library modified to add necesary methods

It's a version of the lib linkedin-j (http://code.google.com/p/linkedin-j/) but with added functionality. Some things added:
- We can retrieve the linkedin user email address.
- We can explicitly send scope parameters to determine the grade of permissions in linkedin.
- We can post to a linkedin group with a submittedUrl, postTitle, postDescription and a thumbnailUrl, not only with title and summary
