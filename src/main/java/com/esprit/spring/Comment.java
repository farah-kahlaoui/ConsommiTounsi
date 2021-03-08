package com.esprit.spring;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "T_COMMENT")
public class Comment implements Serializable {
	

		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int CommentId;
		
		public int getCommentId() {
			return CommentId;
		}
		public void setCommentId(int commentId) {
			CommentId = commentId;
		}

}
