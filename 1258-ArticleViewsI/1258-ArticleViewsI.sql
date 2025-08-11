-- Last updated: 12/08/2025, 00:15:26
# Write your MySQL query statement below
select distinct author_id as id from Views
where author_id=viewer_id order by author_id;