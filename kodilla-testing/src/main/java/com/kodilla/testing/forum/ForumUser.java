package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {
    private String name;
    private String realName;
    private ArrayList<ForumPost> post = new ArrayList<>();
    private LinkedList<ForumComment> comments = new LinkedList<>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public void addPost(String author, String postBody){
        ForumPost thePost = new ForumPost(author, postBody);
        post.add(thePost);
    }

    public void addComment(ForumPost thePost, String author, String commentBody){
        ForumComment theComment = new ForumComment(thePost, author, commentBody);
        comments.add(theComment);
    }

    public int getPostsQuantity(){
       return post.size();
    }

    public int getCommentsQuantity(){
       return comments.size();
    }

    public ForumPost getPost(int postNumber){
        ForumPost thePost = null;
        if(postNumber>=0 && postNumber<post.size()){
            thePost = post.get(postNumber);
        }
        return thePost;
    }

    public ForumComment getComment(int commentNumber){
        ForumComment theComment = null;
        if(commentNumber>=0 && commentNumber<comments.size()){
            theComment = comments.get(commentNumber);
        }
        return theComment;
    }

    public boolean removeComment(ForumComment theComment){
        if(comments.contains(theComment)) {
            comments.remove(theComment);
            System.out.println("Comment has been removed");
            return true;
        }else {
            System.out.println("There is no such comment");
            return false;
        }
    }

    public boolean removePost(ForumPost thePost){
       if(post.contains(thePost)){
           post.remove(thePost);
           System.out.println("Post has been removed");
           return true;
       }else {
           System.out.println("There is no such post");
           return false;
       }
    }

    public String getName(){
        return name;
    }

    public String getRealName(){
        return realName;
    }
}
