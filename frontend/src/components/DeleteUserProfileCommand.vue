<template>
    <v-card outlined>
        <v-card-title>
            DeleteUserProfile
        </v-card-title>

        <v-card-text>
            <String label="Username" v-model="value.username" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="deleteUserProfile"
            >
                DeleteUserProfile
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'DeleteUserProfileCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.username = '';
        },
        watch: {
        },
        methods: {
            deleteUserProfile() {
                this.$emit('deleteUserProfile', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

